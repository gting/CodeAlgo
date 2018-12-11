package com.pas.analy;

import java.math.BigInteger;

public class Exception {
    public Exception(){

    }
    public double oneF()
    {
        String hex = "FF";
        Integer x = Integer.parseInt(hex,16);
        double d = (double)x;
        return d;
    }

    public double twoF()
    {
        String hex = "FFFF";
        Integer x = Integer.parseInt(hex,16);
        double d = (double)x;
        return d;
    }
    public double threeF()
    {
        String hex = "FFFFFF";
        Integer x = Integer.parseInt(hex,16);
        double d = (double)x;
        return d;
    }
    public double fourF()
    {
        String str = new BigInteger("FFFFFFFF", 16).toString(10);

        double d = Double.parseDouble(str);

        return d;
    }
    public double F()
    {
        String hex = "F0";
        Integer x=Integer.parseInt(hex,16);
        double d = (double)x;
        return d;
    }
    public double F2()
    {
        String hex = "1E2";
        Integer x=Integer.parseInt(hex,16);
        double d = (double)x;
        return d;
    }
    public double R()
    {
        String hex = "F1";
        Integer x=Integer.parseInt(hex,16);
        double d = (double)x;
        return d;
    }

    public double FEPC1()
    {
        String hex = "212223";
        Integer x=Integer.parseInt(hex,16);
        double d = (double)x;
        return d;
    }

    public double REPC1()
    {
        String hex = "242526";
        Integer x=Integer.parseInt(hex,16);
        double d = (double)x;
        return d;
    }

    public double REPC2()
    {
        String hex = "272829";
        Integer x=Integer.parseInt(hex,16);
        double d = (double)x;
        return d;
    }

}
