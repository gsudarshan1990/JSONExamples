package com.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONRead {
	
	static JSONParser parser;
	static JSONObject jsonobject;
	
	public static void main(String[] args)
	{
		parser=new JSONParser();
		try {
			Object obj=parser.parse(new FileReader("./outputjson.json"));
			jsonobject=(JSONObject)obj; 
			String name=(String)jsonobject.get("name");
			System.out.println(name);
		
			
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
		
	}

}
