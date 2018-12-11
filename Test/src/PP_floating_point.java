import java.nio.ByteBuffer;

/**
 * Created by nemo on 2017/5/16.
 * <p>
 * 注意！！！
 * 不能直接用String.getBytes
 * 应该是将value切分为 4个或8个字节 每个字节就是一个8bit的二进制数字 eg：01011010
 * 之后--->int--->byte
 * <p>
 * 4个字节--->float
 * 8个字节--->double
 */
public class PP_floating_point {
    public static String trans(String value, double resolusion, double offset, int type, String list)  {
       /* if(!UdsMethod.isValid(value))
            return null;*/
        /*字节数，也就是二进制数字的个数*/
        int size = value.length() / 8;


        /*切分成N个字节,就是N个8bit的二进制数字
         * 将每个二进制数字转成byte
         * */
        byte[] bytes = new byte[size];
        for (int j = 0; j < size; j++) {
            String binStr = value.substring(j * 8, (j + 1) * 8);
            bytes[j] = (byte) Integer.parseInt(binStr, 2);
        }


        if (size == 4) {

            return String.valueOf(ByteBuffer.wrap(bytes));

        } else if (size == 8) {

            return String.valueOf(ByteBuffer.wrap(bytes));


        } else {
            throw new RuntimeException("输入长度错误");
        }

    }

    public static void main(String[] args)  {
//        IDataTrans dataTrans = new PP_floating_point();
        String value = "00100010001000100010001000100010";
        /*String list = "{\"ElementCount\":\"0\",\"Sign\":\"0\",\"Format\":\"0\",\"Data_havelength\":\"y\"}";
        String list2 = "{\"ElementCount\":\"0\",\"Sign\":\"1\",\"Format\":\"0\",\"Data_havelength\":\"y\"}";*/
        String result = trans(value, 1, 0, 0, null);
        System.out.println(result);

    }
}