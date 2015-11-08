package com.hit.jiajie.bean;

/**
 * Created by ¼Ö½Ü on 2015/11/7.
 */
public class Train {
    private String lineID;
    private double weeks;
    private double target;
    private double hour;
    private  String date;


    public String getLineID() {
        return lineID;
    }

    public void setLineID(String lineID) {
        this.lineID = lineID;
    }

    public double getWeeks() {
        return weeks;
    }

    public void setWeeks(double weeks) {
        this.weeks = weeks;
    }

    public double getTarget() {
        return target;
    }

    public void setTarget(double target) {
        this.target = target;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double[] getInput() {
       double[] input=new double[7];
       // input[0]=lineID;
        input[1]=weeks;
        input[2]=hour;
        input[3]=hour*hour;
        input[4]=weeks*weeks;
        input[5]=hour*hour*hour;
        input[6]=hour*1000;

        return input;
    }
}
