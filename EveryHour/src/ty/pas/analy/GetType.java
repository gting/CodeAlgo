package ty.pas.analy;

public class GetType {
    public static String getType(Object o){ //获取变量类型方法
        return o.getClass().toString(); //使用int类型的getClass()方法
    }
}
