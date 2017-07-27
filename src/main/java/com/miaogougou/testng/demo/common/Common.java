package com.miaogougou.testng.demo.common;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import java.io.BufferedReader;  
import java.io.File;  
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import java.io.FileReader;  
import java.io.IOException;
import java.text.SimpleDateFormat; 
/**
 * 
 * @ClassName: Common 
 * @Description: 解析JSON内容
 * @author DaiJunjun daijj@ipharmacare.net
 * @date 2017年4月19日 上午11:34:29 
 *
 */
public class Common {
	/**
	 * 
	 * @Title: getJsonValue 
	 * @Description: 解析JSON内容 
	 * @param @param JsonString
	 * @param @param JsonId
	 * @param @return  返回JsonString中JsonId对应的Value  设定文件 
	 * @return String    返回类型 
	 * @throws
	 */
    public static String getJsonValue(String JsonString, String JsonId) {
        String JsonValue = "";
        if (JsonString == null || JsonString.trim().length() < 1) {
            return null;
        }
        try {
            JSONObject obj1 = new JSONObject(JsonString);
            JsonValue = (String) obj1.getString(JsonId);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return JsonValue;
    }
    
}
