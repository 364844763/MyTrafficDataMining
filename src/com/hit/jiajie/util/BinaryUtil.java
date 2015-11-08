package com.hit.jiajie.util;

/**
 * Created by jiajie on 15/11/6.
 */
public class BinaryUtil {
    public static double[] inputInvert(int value){
       double[] input=new double[64];
       int i=value/100;
       input[i]=1;
       return input;
    }
    public static double targetInvert(double[] binary){
        double max=0;
        int target=-1;
        for (int i = 0; i <binary.length; i++) {
            if (binary[i]>max){
                max=binary[i];
                target=i;
            }
        }
        return target*100;
    }

}
