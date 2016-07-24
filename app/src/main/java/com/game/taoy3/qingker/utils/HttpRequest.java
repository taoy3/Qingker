package com.game.taoy3.qingker.utils;

import android.app.Activity;
import android.support.annotation.NonNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/**
 * Created by taoy3 on 16/4/6.
 */
public class HttpRequest {
    private static HttpRequest request;
    private HttpRequest(){}
    public static HttpRequest getInstance(){
        synchronized (HttpRequest.class){
            if (request==null){
                request = new HttpRequest();
            }
        }
        return request;
    }
    public void post(final String u, final Activity activity, final Map<String,String> map, final RequestCallBack callBack){
        new Thread(){
            @Override
            public void run() {
                super.run();
                Object result = null;
                HttpURLConnection connection = null;
                BufferedReader reader = null;
                StringBuffer buffer = new StringBuffer();
                try {
                    URL url = new URL(u);
                    try {
                        connection = (HttpURLConnection) url.openConnection();
                        connection.setDoOutput(true);
                        connection.setDoInput(true);
                        connection.setConnectTimeout(20000);
                        connection.setRequestMethod("POST");
                        connection.setRequestProperty("Content-Type","application/json");
                        if(null!=map){
                            for (Map.Entry<String,String> entry:map.entrySet()){
                                connection.setRequestProperty(entry.getKey(),entry.getValue());
                            }
                        }

                        if(connection.getResponseCode()== HttpURLConnection.HTTP_OK){
                            reader = new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));
                            connection.connect();
                            String temp;
                            while (null!=(temp = reader.readLine())){
                                buffer.append(temp);
                            }
                            result = buffer.toString();
                        }else {
                            result = new Exception("连接失败");
                        }
                    } catch (IOException e) {
                        result = e;
                    }
                } catch (MalformedURLException e) {
                    result = e;
                }finally {
                    if (null!=connection){
                        connection.disconnect();
                    }
                    if(null!=reader){
                        try {
                            reader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if(null!=result){
                        onResult(activity,result,callBack);
                    }
                }
            }
        }.start();
    }
    public void get(final String u, final Activity activity, final Map<String,String> map, final RequestCallBack callBack){
        new Thread(){
            @Override
            public void run() {
                super.run();
                String ur=u+"?";
                Object result = null;
                if(map!=null&&!map.isEmpty()){
                    for (Map.Entry<String,String> entry:map.entrySet()){
                        ur+=entry.getKey()+"="+entry.getValue()+"&";
                    }
                }
                ur = ur.substring(0,ur.length()-1);
                HttpURLConnection connection = null;
                BufferedReader reader = null;
                StringBuffer buffer = new StringBuffer();
                try {
                    URL url = new URL(ur);
                    try {
                        connection = (HttpURLConnection) url.openConnection();
                        connection.setDoInput(true);
                        connection.setConnectTimeout(2000);
                        connection.setRequestMethod("GET");
                        connection.setRequestProperty("Content-Type","application/json");
                        int code  =connection.getResponseCode();
                        if(connection.getResponseCode()== HttpURLConnection.HTTP_OK){
                            reader = new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));
                            connection.connect();
                            String temp;
                            while (null!=(temp = reader.readLine())){
                                buffer.append(temp);
                            }
                            result = buffer.toString();
                        }else {
                            result = new Exception("连接失败");
                        }
                    } catch (IOException e) {
                        result = e;
                    }
                } catch (MalformedURLException e) {
                    result = e;
                }finally {
                    if (null!=connection){
                        connection.disconnect();
                    }
                    if(null!=reader){
                        try {
                            reader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if(null!=result){
                        onResult(activity,result,callBack);
                    }
                }
            }
        }.start();
    }
    public void downFile(final String u, final Activity activity, final Map<String,String> map, final RequestCallBack callBack){
        new Thread(){
            @Override
            public void run() {
                super.run();
                HttpURLConnection connection = null;
                InputStream inputStream = null;
                OutputStream outputStream = null;
                Object result = null;
                try {
                    URL url = new URL(u);
                    try {
                        connection = (HttpURLConnection) url.openConnection();
                        connection.setDoOutput(true);
                        connection.setDoInput(true);
                        connection.setConnectTimeout(20000);
                        connection.setRequestProperty("Content-Type","application/json");
                        connection.setRequestMethod("POST");
                        for (Map.Entry<String,String> entry:map.entrySet()){
                            connection.setRequestProperty(entry.getKey(),entry.getValue());
                        }

                        if(connection.getResponseCode()== HttpURLConnection.HTTP_OK){
                            inputStream = connection.getInputStream();
                            outputStream = new FileOutputStream(FileUtils.getFile(u));
                            connection.connect();
                            readWriteFile(inputStream,outputStream);
                            result = "下载成功";
                        }else {
                            result = new Exception("连接失败");
                        }
                    } catch (IOException e) {
                        result = e;
                    }
                } catch (MalformedURLException e) {
                    result = e;
                }finally {
                    if (null!=connection){
                        connection.disconnect();
                    }
                    if(null!=inputStream){
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if(null!=outputStream){
                        try {
                            outputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if(null!=result){
                        onResult(activity,result,callBack);
                    }
                }
            }
        }.start();
    }
    public void upFile(final String u, final Activity activity, final Map<String,String> map, final File file, final RequestCallBack callBack){
        new Thread(){
            @Override
            public void run() {
                super.run();
                HttpURLConnection connection = null;
                BufferedReader reader = null;
                InputStream fileInput = null;
                StringBuffer buffer = new StringBuffer();
                OutputStream outputStream = null;
                Object result = null;
                try {
                    URL url = new URL(u);
                    try {
                        connection = (HttpURLConnection) url.openConnection();
                        connection.setDoOutput(true);
                        connection.setDoInput(true);
                        connection.setRequestProperty("Content-Type","application/json");
                        connection.setConnectTimeout(20000);
                        connection.setRequestMethod("POST");
                        for (Map.Entry<String,String> entry:map.entrySet()){
                            connection.setRequestProperty(entry.getKey(),entry.getValue());
                        }
                        outputStream = connection.getOutputStream();
                        fileInput = new FileInputStream(file);
                        readWriteFile(fileInput, outputStream);

                        if(connection.getResponseCode()== HttpURLConnection.HTTP_OK){
                            reader = new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));
                            connection.connect();
                            String temp;
                            while (null!=(temp = reader.readLine())){
                                buffer.append(temp);
                            }
                            result = buffer.toString();
                        }else {
                            result = new Exception("连接失败");
                        }
                    } catch (IOException e) {
                        result = e;
                    }
                } catch (MalformedURLException e) {
                    result = e;
                }finally {
                    if (null!=connection){
                        connection.disconnect();
                    }
                    if(null!=reader){
                        try {
                            reader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if(null!=outputStream){
                        try {
                            outputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if(null!=fileInput){
                        try {
                            fileInput.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if(null!=result){
                        onResult(activity,result,callBack);
                    }
                }
            }
        }.start();
    }

    @NonNull
    private void readWriteFile(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] b = new byte[1024];
        int size;
        while ((size=inputStream.read(b))!=-1){
            outputStream.write(b,0,size);
        }
    }
    private void onResult(Activity activity, final Object object, final RequestCallBack callBack){
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(object instanceof String){
                    callBack.onSucceed((String) object);
                }else if (object instanceof Exception){
                    callBack.onFail((Exception) object);
                }
            }
        });
    }

    public interface RequestCallBack{
        void onFail(Exception e);
        void onSucceed(String result);
    }
}
