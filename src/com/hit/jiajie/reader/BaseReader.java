package com.hit.jiajie.reader;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 打入文件基类
 * Created by jiajie on 15/11/3.
 */
public class BaseReader {

    protected Map<Object,Object> DataMap=new HashMap<>();

    public Map<Object,Object> read(String path){
        try {
            File f = new File(path);
            InputStreamReader read = new InputStreamReader(new FileInputStream(f),"UTF-8");
            FileReader fileReader=new FileReader(path);
            BufferedReader br=new BufferedReader(read);
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
