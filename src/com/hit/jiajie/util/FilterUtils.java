package com.hit.jiajie.util;

/**
 * Created by ¼Ö½Ü on 2015/11/12.
 */
public class FilterUtils {
    public static int[] holidays={20140811,20140815,20140818,20140928,20140908,201401007,20141001,20141002,2014103,20141004,20141005,20141006,20141011};

    public static boolean filterHoliday(String date){
        String[] temps=date.split("/");
        int i=Integer.parseInt(temps[0])*10000+Integer.parseInt(temps[1])*100+Integer.parseInt(temps[2]);
        for (int holiday:holidays){
            if (holiday==i)
                return true;
        }
        return false;
    }

}
