package com.hit.jiajie.Dataming;

import com.hit.jiajie.bean.Train;

import java.util.List;

/**
 * Created by ¼Ö½Ü on 2015/11/10.
 */
public class Average {
    private int[][] total=new int[24][7];
    private int[][] num=new int[24][7];
    private int[][] ave=new int[24][7];

    public int[][] getAve(List<Train> trains){
        for (Train train:trains){
            total[(int)train.getHour()][(int)train.getWeeks()]+=train.getTarget();
            num[(int)train.getHour()][(int)train.getWeeks()]++;
        }
        for (int i = 0; i <24; i++) {
            for (int j = 0; j <7; j++) {
                if (num[i][j]!=0){
                    ave[i][j]=total[i][j]/num[i][j];
                }
            }

        }
        return ave;
    }



}
