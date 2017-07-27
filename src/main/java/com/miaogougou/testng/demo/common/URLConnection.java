package com.miaogougou.testng.demo.common;

import java.net.HttpURLConnection;
import java.net.URL;
public class URLConnection {    
    public static HttpURLConnection getConnection(String url){
        HttpURLConnection connection = null;
        try {
            // 打开和URL之间的连接
            URL getUrl = new URL(url);
            connection = (HttpURLConnection) getUrl.openConnection();
             // 设置通用的请求属性
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("GET");
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Charset", "utf-8");
            connection.setRequestProperty("Accept-Charset", "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return connection;
    }
}