package com.hit.jiajie.bean;

/**
 * 天气结合
 * Created by jiajie on 15/11/5.
 */
public class Weather {
    private String date;
    private int weatherType;
    private int windyType;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(int weatherType) {
        this.weatherType = weatherType;
    }

    public int getWindyType() {
        return windyType;
    }

    public void setWindyType(int windyType) {
        this.windyType = windyType;
    }
}
