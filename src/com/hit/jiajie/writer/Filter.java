package com.hit.jiajie.writer;

import com.hit.jiajie.bean.DayAndPeople;
import com.hit.jiajie.bean.HourInformation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by jiajie on 15/11/6.
 */
public class Filter {
    public void write(Map map,String path){
        Iterator iter = map.entrySet().iterator();
        FileWriter fw = null;
        try {
            fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);
            while (iter.hasNext()) {
                Map.Entry entry = (Map.Entry) iter.next();
                HourInformation key= (HourInformation) entry.getKey();
                if (key.getHour()>=6&&key.getHour()<=21) {
                    String line;
                    List<DayAndPeople> list= (List<DayAndPeople>) entry.getValue();
                    for (DayAndPeople dayAndPeople:list){
                        line=key.getName()+","+key.getHour()+",";
                        line=line+dayAndPeople.getDay()+","+dayAndPeople.getNum()+",";
                        bw.write(line);
                        bw.newLine();
                        bw.flush();
                    }


                }

            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bw = new BufferedWriter(fw);

    }

}
