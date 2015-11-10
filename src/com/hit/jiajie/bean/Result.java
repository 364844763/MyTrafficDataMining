package com.hit.jiajie.bean;

/**
 * Created by ¼Ö½Ü on 2015/11/8.
 */
public class Result {
    private String LineID;
    private String date;
    private String hour;

    public String getLineID() {
        return LineID;
    }

    public void setLineID(String lineID) {
        LineID = lineID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Result)) return false;

        Result result = (Result) o;

        if (LineID != null ? !LineID.equals(result.LineID) : result.LineID != null) return false;
        if (date != null ? !date.equals(result.date) : result.date != null) return false;
        return !(hour != null ? !hour.equals(result.hour) : result.hour != null);

    }

    @Override
    public int hashCode() {
        int result = LineID != null ? LineID.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (hour != null ? hour.hashCode() : 0);
        return result;
    }
}
