package com.json;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



public class JSONExample {


	public static void main(String[] args)  
	{
		JSONObject json=new JSONObject();
		json.put("name", "sudarshan");
		json.put("age","29");
		
		JSONArray list=new JSONArray();
		list.add("first message");
		list.add("Second message");
		list.add("Third message");
		json.put("message",list);
		
		System.out.println(json);
		
		try {
			FileWriter file=new FileWriter("E:\\sts examples\\JSONExample\\outputjson.json");
			file.write(json.toJSONString());
			file.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
	
		}
		
		System.out.println(json);
	}
	
	
}
