package com.hit.jiajie.bean;

/**
 * Created by ¼Ö½Ü on 2015/11/4.
 */
public class HourInformation {
    private String name;
    private int hour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HourInformation)) return false;

        HourInformation that = (HourInformation) o;

        if (getHour() != that.getHour()) return false;
        return getName().equals(that.getName());

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getHour();
        return result;
    }
}
