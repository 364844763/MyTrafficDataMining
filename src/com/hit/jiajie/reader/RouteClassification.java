package com.hit.jiajie.reader;

import com.hit.jiajie.bean.LineInformation;

/**
 * Created by jiajie on 15/11/3.
 */
public class RouteClassification extends BaseReader{

    @Override
    public void operater(String line) {
        String[] temp = line.split(",");
        LineInformation lineInformation=new LineInformation();
        lineInformation.setLine_name(temp[1]);
        lineInformation.setDeal_time(Integer.parseInt(temp[5]));
        if (DataMap.containsKey(lineInformation)){
           int i=(int)DataMap.get(lineInformation);
            i++;
            DataMap.put(lineInformation,i);
        }else {
            DataMap.put(lineInformation,1);
        }
    }
}
