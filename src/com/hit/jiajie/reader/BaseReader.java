package com.hit.jiajie.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiajie on 15/11/3.
 */
public class BaseReader {

    protected Map<Object,Object> DataMap=new HashMap<>();

    public Map<Object,Object> read(String path){
        try {
            FileReader fileReader=new FileReader(path);
            BufferedReader br=new BufferedReader(fileReader);
            String line=br.readLine();
            while (line!=null){
                operater(line);
                line=br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return DataMap;

    }
    public void operater(String line){
        //重写操作
    }


}
