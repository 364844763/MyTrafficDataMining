package com.hit.jiajie.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 时间工具类
 * Created by jiajie on 15/11/5.
 */
public class TimeUtil {
    /**
     * 根据日期显示星期几
     * @param pTime yyyy-MM-dd
     * @return 周几
     * @throws Exception
     */
    public static int dayForWeek(String pTime) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(format.parse(pTime));
        int dayForWeek = 0;
        if(c.get(Calendar.DAY_OF_WEEK) == 1){
            dayForWeek = 7;
        }else{
            dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
        }
        return dayForWeek;
    }
}
