package com.hit.jiajie;

import com.hit.jiajie.bean.LineInformation;
import com.hit.jiajie.reader.ClassifyByDay;
import com.hit.jiajie.reader.RouteClassification;
import com.hit.jiajie.writer.ClassifyByDayWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        ClassifyByDay classifyByDay=new ClassifyByDay();
        Map map=classifyByDay.read("E:\\天池大赛\\Part1-数据\\gb_train_classify_by_day.CSV");
        ClassifyByDayWriter writer=new ClassifyByDayWriter();
        writer.write(map,"E:\\天池大赛\\Part1-数据\\gb_train_classify_by_hour.CSV");
	// write your code here
       /* RouteClassification routeClassification=new RouteClassification();
        Map map=routeClassification.read("E:\\天池大赛\\Part1-数据\\gd_train_data.txt");
        Iterator iter = map.entrySet().iterator();
        FileWriter fw = new FileWriter("E:\\天池大赛\\Part1-数据\\gb_train_classify_by_day.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            LineInformation key = (LineInformation) entry.getKey();
            int val = (int) entry.getValue();
            bw.write(key.getLine_name()+","+key.getDeal_time()+","+val);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        fw.close();*/
    }
}
