package com.hit.jiajie;

import com.hit.jiajie.Dataming.BP;
import com.hit.jiajie.bean.LineInformation;
import com.hit.jiajie.bean.Train;
import com.hit.jiajie.reader.ClassifyByDay;
import com.hit.jiajie.reader.DiffTest;
import com.hit.jiajie.reader.RouteClassification;
import com.hit.jiajie.reader.WeatherReader;
import com.hit.jiajie.util.BinaryUtil;
import com.hit.jiajie.writer.ClassifyByDayWriter;
import com.hit.jiajie.writer.CombineWeather;
import com.hit.jiajie.writer.Filter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
//        DiffTest diffTest=new DiffTest();
//        diffTest.diff("E:\\天池大赛\\part1_data\\gb_train_classify_by_day_filter.CSV");
//        BP bp=new BP(7,50,64,0.4,1);
//        List<Train> trains=diffTest.getTrains();
//        List<Train> tests=diffTest.getTests();
//        for (Train train:trains){
//         // double[] targets= BinaryUtil.inputInvert((int) train.getTarget());
//           double[] targets= BinaryUtil.inputInvert((int)train.getTarget());
//            bp.train(train.getInput(),targets);
//        }
//        for (Train test:tests){
//           double[] targets=bp.test(test.getInput());
//           // double target=targets[0];
//            double target=BinaryUtil.targetInvert(targets);
//            double result=Math.abs(target-test.getTarget())/test.getTarget();
//            System.out.println(test.getDate()+":"+ "预测"+target+"实际"+test.getTarget()+ "成绩"+result);
//        }


//
	// write your code here
//        RouteClassification routeClassification=new RouteClassification();
//        Map map=routeClassification.read("E:\\天池大赛\\part1_data\\gd_train_data.txt");
//        Iterator iter = map.entrySet().iterator();
//        FileWriter fw = new FileWriter("E:\\天池大赛\\part1_data\\gb_train_classify_by_day.txt", true);
//        BufferedWriter bw = new BufferedWriter(fw);
//        while (iter.hasNext()) {
//            Map.Entry entry = (Map.Entry) iter.next();
//            LineInformation key = (LineInformation) entry.getKey();
//            int val = (int) entry.getValue();
//            bw.write(key.getLine_name()+","+key.getDeal_time()+","+val);
//            bw.newLine();
//            bw.flush();
//        }
//        bw.close();
//        fw.close();
        ClassifyByDay classifyByDay=new ClassifyByDay();
        Map map=classifyByDay.read("E:\\天池大赛\\part1_data\\gb_train_classify_by_day.txt");
        Filter filter=new Filter();
        filter.write(map,"E:\\天池大赛\\part1_data\\gb_train_classify_by_day_filter.CSV");
//        ClassifyByDayWriter writer=new ClassifyByDayWriter();
//        writer.write(map,"E:\\天池大赛\\part1_data\\gb_train_classify_by_hour.CSV");

        DiffTest diffTest=new DiffTest();
        diffTest.diff("E:\\天池大赛\\part1_data\\gb_train_classify_by_day_filter.CSV");
      //  BP bp=new BP(7,50,64,0.4,1);
        List<Train> trains=diffTest.getTrains();
        List<Train> tests=diffTest.getTests();
        trains.addAll(tests);
        map=new WeatherReader().read("E:\\天池大赛\\part1_data\\gd_weather_report.txt");
        CombineWeather cw=new CombineWeather();
        cw.setTrains(trains);
        cw.setWeatherMap(map);
        cw.write("E:\\天池大赛\\part1_data\\结合天气.csv");
    }
}
