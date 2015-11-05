package com.hit.jiajie.writer;

import com.hit.jiajie.bean.DayAndPeople;
import com.hit.jiajie.bean.HourInformation;

import java.util.List;
import java.util.Map;

/**
 * Created by ¼Ö½Ü on 2015/11/4.
 */
public class ClassifyByDayWriter extends BaseWriter {
    @Override
    protected String operate(Map.Entry entry) {
        String line;
        HourInformation hourInformation= (HourInformation) entry.getKey();
        line=hourInformation.getName()+","+hourInformation.getHour()+",";
        List<DayAndPeople> list= (List<DayAndPeople>) entry.getValue();
        for (DayAndPeople dayAndPeople:list){
            line=line+dayAndPeople.getDay()+" "+dayAndPeople.getNum()+",";
        }
        return line;
    }
}
