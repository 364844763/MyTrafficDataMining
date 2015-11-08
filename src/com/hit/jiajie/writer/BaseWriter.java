package com.hit.jiajie.writer;

import com.hit.jiajie.bean.LineInformation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by ¼Ö½Ü on 2015/11/4.
 */
public abstract class BaseWriter {
    public void write(Map map,String path){
        Iterator iter = map.entrySet().iterator();
        FileWriter fw = null;
        try {
            fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);
            while (iter.hasNext()) {
                Map.Entry entry = (Map.Entry) iter.next();
                bw.write(operate(entry));
                bw.newLine();
                bw.flush();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    protected String operate( Map.Entry entry){
       String line=null;
       return line;
    }
}


