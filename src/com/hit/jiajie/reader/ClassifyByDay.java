package com.hit.jiajie.reader;

import com.hit.jiajie.bean.DayAndPeople;
import com.hit.jiajie.bean.HourInformation;
import sun.security.util.Length;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ¼Ö½Ü on 2015/11/4.
 */
public class ClassifyByDay extends BaseReader {

    @Override
    public void operater(String line) {
        String[] temp = line.split(",");
        HourInformation hourInformation=new HourInformation();
        int hour=Integer.parseInt(temp[1].substring(temp[1].length()-2));
        hourInformation.setHour(hour);
        hourInformation.setName(temp[0]);
        if (DataMap.containsKey(hourInformation)){
            List<DayAndPeople> dayAndPeopleList= (List<DayAndPeople>) DataMap.get(hourInformation);
            DayAndPeople dayAndPeople=new DayAndPeople();
            dayAndPeople.setDay(Integer.parseInt(temp[1].substring(0, temp[1].length() - 2)));
            dayAndPeople.setNum(Integer.parseInt(temp[2]));
            dayAndPeopleList.add(dayAndPeople);
            DataMap.put(hourInformation,dayAndPeopleList);
        }else {
            List<DayAndPeople> dayAndPeopleList=new ArrayList<>();
            DayAndPeople dayAndPeople=new DayAndPeople();
            dayAndPeople.setDay(Integer.parseInt(temp[1].substring(0, temp[1].length() - 2)));
            dayAndPeople.setNum(Integer.parseInt(temp[2]));
            dayAndPeopleList.add(dayAndPeople);
            DataMap.put(hourInformation,dayAndPeopleList);
        }
    }
}
