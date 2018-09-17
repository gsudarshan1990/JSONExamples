package com.json;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject json=new JSONObject();
		json.put("name","sudarshan");
		json.put("age", "29");
		json.put("location","chennai");
		
		JSONArray list=new JSONArray();
		list.add("first message");
		list.add("second message");
		list.add("third message");
		
		json.put("message",list);
		
		System.out.println(json);
		
		try {
			FileWriter fw=new FileWriter(new File(".//write.json"));
			fw.write(json.toJSONString());
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
