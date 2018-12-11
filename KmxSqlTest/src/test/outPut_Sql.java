package test;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class outPut_Sql
{
    private String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String dbURL;
    private String userName;
    private String userPwd;
    protected Connection dbConn = null;
    protected String sql_instruct = null;
    static int count = 0;
    private int num = 0;

    public outPut_Sql(String url, String name, String pwd)
    {
        this.dbURL = url;
        this.userName = name;
        this.userPwd = pwd;
    }

    public void Connect()
    {
        try
        {
            Class.forName(this.driverName);
            this.dbConn = DriverManager.getConnection(this.dbURL, this.userName, this.userPwd);
            System.out.println("Connected");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.print("Failed to connect the Server" + this.dbURL);
        }
    }

    public void Close()
    {
        try
        {
            this.dbConn.close();
            if (count != 0) {
                System.out.println("Write Columns : " + count);
            }
            System.out.println("Closed");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public ArrayList<String> Read(String sql_code)
    {
        ArrayList<String> result = new ArrayList();
        this.sql_instruct = sql_code;
        try
        {
            Statement stmt = this.dbConn.createStatement();
            ResultSet rs = stmt.executeQuery(this.sql_instruct);
            ResultSetMetaData rsmd = rs.getMetaData();
            int count = rsmd.getColumnCount();
            System.out.println(count);
            while (rs.next()) {
                for (int i = 1; i <= count; i++)
                {
                    String key = rsmd.getColumnName(i);
                    String value = rs.getString(key);

                    result.add(value);

                    this.num += 1;
                }
            }
            System.out.println(this.num);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }

    public void Output(List<HashMap<String, Object>> data, String sql_ins, String[] keys)
    {
        try
        {
            PreparedStatement preparedStatement = this.dbConn.prepareStatement(sql_ins);
            int batchSize = 10000;
            int count = 0;
            for (Map<String, Object> map : data)
            {
                for (int i = 0; i < keys.length; i++) {
                    preparedStatement.setString(i + 1, String.valueOf(map.get(keys[i])));
                }
                preparedStatement.addBatch();
                count++;
                if ((count % 1000 == 0) && (count != 0)) {
                    preparedStatement.executeBatch();
                }
            }
            preparedStatement.executeBatch();
            preparedStatement.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public List<String> Read(List<String> Dynamicpara, String sql_code)
    {
        List<String> Vcl_list = new ArrayList();
        this.sql_instruct = sql_code;
        try
        {
            PreparedStatement pstmt = this.dbConn.prepareStatement(this.sql_instruct);
            for (int i = 1; i <= Dynamicpara.size(); i++) {
                pstmt.setString(i, (String)Dynamicpara.get(i - 1));
            }
            System.out.println();
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Vcl_list.add(rs.getString(1));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return Vcl_list;
    }

    public void Write(String sql_code)
    {
        this.sql_instruct = sql_code;
        try
        {
            Statement stmt = this.dbConn.createStatement();
            count += stmt.executeUpdate(this.sql_instruct);
        }
        catch (SQLException localSQLException) {}
    }
}
