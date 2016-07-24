package com.game.taoy3.qingker.utils;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taoy3 on 16/4/10.
 */
public class GsonUtils {
    private GsonUtils(){}
    private static Gson gson;
    private static GsonUtils gsonUtils;
    public static GsonUtils getInstance(){
        synchronized (GsonUtils.class){
            if(gsonUtils ==null){
                gsonUtils = new GsonUtils();
                gson = new Gson();
            }
        }
        return gsonUtils;
    }
    public<T> T parseBean(String s,Class<T> clazz){
        return gson.fromJson(s, clazz);
    }
    public<T> List<T> parseArray(String json,Class<T> clazz){
        List<T> list = null;
        try {
            JSONArray array = new JSONArray(json);
            list = new ArrayList<>();
            if(null!=array&&array.length()>0){
                for(int i=0;i<array.length();i++){
                list.add(parseBean(array.get(i).toString(),clazz));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return list;
    }
}
