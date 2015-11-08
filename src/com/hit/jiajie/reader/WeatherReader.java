package com.hit.jiajie.reader;

import com.hit.jiajie.bean.Weather;
import com.hit.jiajie.util.TimeUtil;
import com.hit.jiajie.writer.BaseWriter;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by �ֽ� on 2015/11/7.
 */
public class WeatherReader extends BaseReader{


    @Override
    public void operater(String line) {
        Weather weather=new Weather();
        if(line.equals(""))return;
        String[] temp=line.split(",");
        weather.setDate(TimeUtil.timeParse(temp[0],'/'));
        weather.setWeatherType(temp[1].split("/")[0]);
        weather.setWindyType(temp[2].split("/")[0]);
        DataMap.put(TimeUtil.timeParse(temp[0], '/'), weather);
    }
}
