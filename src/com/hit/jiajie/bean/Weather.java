package com.hit.jiajie.bean;

/**
 * 天气结合
 * Created by jiajie on 15/11/5.
 */
public class Weather {
    private String date;
    private String weatherType;
    private String windyType;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType;
    }

    public String getWindyType() {
        return windyType;
    }

    public void setWindyType(String windyType) {
        this.windyType = windyType;
    }
}
