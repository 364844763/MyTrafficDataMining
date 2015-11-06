package com.hit.jiajie.util;

/**
 * Created by jiajie on 15/11/6.
 */
public class BinaryUtil {
    public static double[] inputInvert(int value){
        int index = 31;
        double[] binary=new double[32];
        do {
            binary[index--] = (value & 1);
            value >>>= 1;
        } while (value != 0);
        return binary;
    }
    public static double targetInvert(double[] binary){
        double target=0;
        int temp=1;
        for (double i:binary){
            if (i>0.5)
            target=target+temp*i;
            temp*=2;
        }
        return target;
    }

}
