package com.hit.jiajie.bean;

/**
 * 统计每天内每小时乘车人数
 * Created by jiajie on 15/11/3.
 */
public class LineInformation {

    private String Line_name;
    private int Deal_time;

    public int getDeal_time() {
        return Deal_time;
    }

    public void setDeal_time(int deal_time) {
        Deal_time = deal_time;
    }

    public String getLine_name() {
        return Line_name;
    }

    public void setLine_name(String line_name) {
        Line_name = line_name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LineInformation)) return false;

        LineInformation that = (LineInformation) o;

        if (Deal_time != that.Deal_time) return false;
        return !(Line_name != null ? !Line_name.equals(that.Line_name) : that.Line_name != null);

    }

    @Override
    public int hashCode() {
        int result = Line_name != null ? Line_name.hashCode() : 0;
        result = 31 * result + Deal_time;
        return result;
    }
}
