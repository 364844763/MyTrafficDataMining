package com.hit.jiajie.writer;

import com.hit.jiajie.bean.Train;
import com.hit.jiajie.bean.Weather;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by 贾杰 on 2015/11/7.
 */
public class CombineWeather {
    private List<Train> trains;
    private Map<String,Weather> weatherMap;

    public List<Train> getTrains() {
        return trains;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

    public Map<String, Weather> getWeatherMap() {
        return weatherMap;
    }

    public void setWeatherMap(Map<String, Weather> weatherMap) {
        this.weatherMap = weatherMap;
    }

    public void write(String path){
        FileWriter fw = null;
        try {
            fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);
            String line="路线号,小时,星期,日期,天气,风力,人数";
            bw.write(line);
            bw.newLine();
            bw.flush();
            for (Train train:trains){
                Weather weather=weatherMap.get(train.getDate());
                if (weather==null) continue;
                line=train.getLineID()+","+train.getHour()+","+train.getWeeks()+","+train.getDate()+","+weather.getWeatherType()+","+weather.getWindyType()+","+(int)train.getTarget();
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            bw.close();
            fw.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
