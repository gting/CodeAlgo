package test;

import sun.rmi.runtime.Log;

import java.io.IOException;
import java.io.PrintStream;

public class Source
{
    public static void main(String[] args)
    {
        String str = "7E0F861477034343713FD41068094000120B01000C06108C4A02F9F8FF2A4A00018EA4053CFFFF06C3F8FF234A0000FFFFFFFFFFFF06F4F8FF2A4A00018EA6053CFFFF0AD2F8FF2A4A00018EA4053DFFFF0E9CF8FF234A0000FFFFFFFFFFFF0EAFF8FF2A4A00018EA5053DFFFF1298F8FF234A0000FFFFFFFFFFFF12D1F8FF2A4A00018EA5053DFFFF16A8F8FF234A0000FFFFFFFFFFFF16D9F8FF2A4A00018EA5053EFFFF1A91F8FF234A0000FFFFFFFFFFFF1AB4F8FF2A4A00018EA7053EFFFF1C3FF8FF004A002E0000000000021C3FF8FF014A0021052A003064001C3FF8FF024A0A0C0000000000001E96F8FF234A0000FFFFFFFFFFFF1EE2F8FF2A4A00018EA6053FFFFF22ECF8FF234A0000FFFFFFFFFFFF230CF8FF2A4A00018EA5053FFFFF26F2F8FF234A0000FFFFFFFFFFFF2713F8FF2A4A00018EA40540FFFF2AEEF8FF234A0000FFFFFFFFFFFF2B0FF8FF2A4A00018EA40540FFFF2EEAF8FF234A0000FFFFFFFFFFFF2F0AF8FF2A4A00018EA60541FFFF32E6F8FF234A0000FFFFFFFFFFFF3324F8FF2A4A00018EA30541FFFF36FEF8FF2A4A00018EA60542FFFF3AC4F8FF234A0000FFFFFFFFFFFF3AE5F8FF2A4A00018EA70543FFFF3EBCF8FF234A0000FFFFFFFFFFFF3EF0F8FF2A4A00018EA50543FFFF42B8F8FF234A0000FFFFFFFFFFFF42EEF8FF2A4A00018EA70544FFFF46BEF8FF234A0000FFFFFFFFFFFF46EFF8FF2A4A00018EA50545FFFF4AB0F8FF234A0000FFFFFFFFFFFF4AD0F8FF2A4A00018EA50546FFFF4EACF8FF234A0000FFFFFFFFFFFF4EE2F8FF2A4A00018EA40546FFFF52C7F8FF2A4A00018EA50547FFFF5686F8FF234A0000FFFFFFFFFFFF56BCF8FF2A4A00018EA60548FFFF5A82F8FF234A0000FFFFFFFFFFFF5AA2F8FF2A4A00018EA80549FFFF5E7EF8FF234A0000FFFFFFFFFFFF5EB7F8FF2A4A00018EA4054AFFFF6284F8FF234A0000FFFFFFFFFFFF62B9F8FF2A4A00018EA5054AFFFF6676F8FF234A0000FFFFFFFFFFFF66ACF8FF2A4A00018EA5054CFFFF6A7CF8FF234A0000FFFFFFFFFFFF6A9DF8FF2A4A00018EA8054DFFFF6E82F8FF234A0000FFFFFFFFFFFF6EF3F8FF2A4A00018EA6054EFFFF72A0F8FF2A4A00018EA4054FFFFF7670F8FF234A0000FFFFFFFFFFFF7691F8FF2A4A00018EA60550FFFF7A7FF8FF2A4A00018EA60551FFFF7A7FF8FF284A00000000000000007E91F8FF234A0000FFFFFFFFFFFF7F07F8FF2A4A00018EA80552FFFF8296F8FF234A0000FFFFFFFFFFFF82BDF8FF2A4A00018EA40553FFFF8661F6FF0100F1004700107F6FFF8688F8FF234A0000FFFFFFFFFFFF86BAF8FF2A4A00018EA60555FFFF86BAF6FF010000C30803AA0002008A39F6FF01000004041E03F109078A66F6FF010000063EFFFFFFFFFF8A8EF8FF234A0000FFFFFFFFFFFF8AFCF8FF2A4A00018EA60556FFFF8AFCF6FF0100F10047FFFFFFFFFF8E32F6FF0100F1003E0012526FFFF6007E";

        String str2 = str.substring(50, str.length() - 6);
        try
        {
            LogWriter.log(str.substring(0, 50));
            LogWriter.log("\n");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        String strcont = str.substring(48, 50);

        System.out.println("" + Integer.parseInt(strcont, 16));

        System.out.println(str2.length());
        if (Integer.parseInt(strcont, 16) * 28 == str2.length()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        for (int i = 0; i + 28 <= str2.length(); i += 28) {
            try
            {
                String strs = str2.substring(i, i + 28);
                write(strs);
                System.out.println(str2.substring(i, i + 28));
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    private static void write(String strs)
            throws IOException
    {
        String s = strs.substring(4, 12);

        s = strs.substring(0, 4);

        LogWriter.log(s);
        LogWriter.log(" ");
        LogWriter.log(strs.substring(4, 12));
        LogWriter.log(" ");
        LogWriter.log(strs.substring(12, 28));
//        LogWriter.log(strs.substring(4,28));
        LogWriter.log(" \n");
    }
}
