package ty.pas.analy;


import com.sagittarius.util.TimeUtil;
import edu.thss.platform.pas.userfunc.TestUserFunction;

import java.text.SimpleDateFormat;
import java.util.HashMap;


public class TestSample {
	public static void main(String[] args){

		Interrupt a = new Interrupt();

		String device="10021423799";

		String projectId="PASP20180419152723461";
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

		try {
			long startTime= TimeUtil.string2Date("2018-04-10 00:00:00.000", df);
			long endTime= TimeUtil.string2Date("2018-04-11 00:00:00.000", df);
			TestUserFunction b=new TestUserFunction(device, startTime, endTime, projectId);
			b.testRunOne(a);
		} catch (Exception e) {
			
			// TODO: handle exception
			e.printStackTrace();
		}
		for(HashMap<String, Object> map:a.outputSql){
			for(String key:map.keySet()){
				System.out.println("=========start=========");
				System.out.println(key);
				System.out.println(map.get(key));
				System.out.println("=========end=========");
			}
		}
		
	}
}
