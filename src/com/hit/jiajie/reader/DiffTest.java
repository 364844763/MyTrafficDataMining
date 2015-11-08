package com.hit.jiajie.reader;

import com.hit.jiajie.bean.Train;
import com.hit.jiajie.util.TimeUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiajie on 15/11/6.
 */
public class DiffTest{
    private List<Train> trains=new ArrayList<>();
    private List<Train> tests=new ArrayList<>();
    public void diff(String path){
        try {
            FileReader fileReader=new FileReader(path);
            BufferedReader br=new BufferedReader(fileReader);
            String line=br.readLine();
            while (line!=null){
                String[] temp=line.split(",");
                Train train=new Train();
                train.setDate(TimeUtil.timeParse(temp[2],' '));
                train.setHour(Double.parseDouble(temp[1]));
                train.setLineID(temp[0]);
                train.setTarget(Double.parseDouble(temp[3]));
                train.setWeeks(TimeUtil.dayForWeek(train.getDate()));
                if (temp[2].substring(0,temp[2].length()-1).equals("2014122")){

                    tests.add(train);
                }else {
                    trains.add(train);
                }
                line=br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

    public List<Train> getTests() {
        return tests;
    }

    public void setTests(List<Train> tests) {
        this.tests = tests;
    }
}
