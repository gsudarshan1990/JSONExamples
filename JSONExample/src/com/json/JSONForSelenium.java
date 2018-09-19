package com.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONForSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Object obj;
			String browser;
			String url;
			JSONObject jsonObject=null;
			
			
			
		JSONParser parser =new JSONParser();
		try {
			obj=parser.parse(new FileReader(".//config1.json"));
			jsonObject=(JSONObject)obj;
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		browser=(String)jsonObject.get("browser");
		url=(String)jsonObject.get("URL");
		System.out.println("browser:"+browser+"url:"+url);
	
	}

}
