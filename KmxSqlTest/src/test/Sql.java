package test;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql
        implements Runnable
{
    private static Connection conn = null;
    private static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String url = "jdbc:sqlserver://192.168.15.121:1433;DatabaseName=CTY_Egn_B_201708";
    private static String username = "sa";
    private static String password = "tykj1234@";
    private static Statement NULL = null;
    private final int taskNum;

    public Sql(int taskNum)
    {
        this.taskNum = taskNum;
    }

    public static Statement SqlOpen()
    {
        try
        {
            Class.forName(driverName);
            conn = DriverManager.getConnection(url, username, password);
            if (!conn.isClosed()) {
                System.out.println("*****��������������*****");
            }
            return conn.createStatement();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("������������������������������");
            e.printStackTrace();
        }
        catch (SQLException e)
        {
            System.out.println("��������������");
            e.printStackTrace();
        }
        return NULL;
    }

    public void run()
    {
        ReadSql();
    }

    public void ReadSql()
    {
        ResultSet sql = null;
        Statement state = SqlOpen();
        try
        {
            sql = state.executeQuery("select MsgU_ID,MsgU_Vcl_ID,MsgU_MsgTime from v_Msg_UDS");
            System.out.println("---------task" + this.taskNum + "��������");
            while (sql.next())
            {
                String id = sql.getString(1);
                String MsgU_Vcl_ID = sql.getString(2);
                String MsgU_MsgTime = sql.getString(3);
                System.out.println(id + "\t" + MsgU_Vcl_ID + "\t" + MsgU_MsgTime);
            }
            try
            {
                sql.close();
                state.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.println("----------task" + this.taskNum + "��������");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                sql.close();
                state.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
