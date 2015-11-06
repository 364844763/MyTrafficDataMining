package com.hit.jiajie;

import com.hit.jiajie.Dataming.BP;
import com.hit.jiajie.bean.Train;
import com.hit.jiajie.reader.DiffTest;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        DiffTest diffTest=new DiffTest();
        diffTest.diff("/Users/jiajie/Desktop/Part1-数据/gb_train_classify_by_day_filter.CSV");
        BP bp=new BP(3,200,1,0.1,0.1);
        List<Train> trains=diffTest.getTrains();
        List<Train> tests=diffTest.getTests();
        for (Train train:trains){
         // double[] targets= BinaryUtil.inputInvert((int) train.getTarget());
           double[] targets={train.getTarget() };
            bp.train(train.getInput(),targets);
        }
        for (Train test:tests){
           double[] targets=bp.test(test.getInput());
            double target=targets[0];
            //BinaryUtil.targetInvert(targets);
            double result=Math.abs(target-test.getTarget())/test.getTarget();
            System.out.println(test.getDate()+":"+ target+ " "+result);
        }

//
//        ClassifyByDay classifyByDay=new ClassifyByDay();
//        Map map=classifyByDay.read("/Users/jiajie/Desktop/Part1-数据/gb_train_classify_by_day.CSV");
//        Filter filter=new Filter();
//        filter.write(map,"/Users/jiajie/Desktop/Part1-数据/gb_train_classify_by_day_filter.CSV");

       // ClassifyByDayWriter writer=new ClassifyByDayWriter();
       // writer.write(map,"E:\\天池大赛\\Part1-数据\\gb_train_classify_by_hour.CSV");
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
