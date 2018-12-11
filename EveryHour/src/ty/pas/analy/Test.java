package ty.pas.analy;

public class Test {
    public static void main(String[] args)
    {
        Float i=0f; //int类型变量
        System.out.println(getType(i)); //打印变量类型为int
    }
    public static String getType(Object o){ //获取变量类型方法
        return o.getClass().toString(); //使用int类型的getClass()方法
    }
}
