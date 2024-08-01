package org.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSON1 {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\src\\test\\resources\\TestSample1.json");
		FileReader reader = new FileReader(f);
		
		JSONParser parser = new JSONParser();
		Object parse = parser.parse(reader);
		
		JSONObject obj = (JSONObject) parse;
		String string = obj.get("total").toString();
		System.out.println(string);
		
		Object object = obj.get("data");
		
		//Convert these object to array:
		
		JSONArray arr = (JSONArray) object;
		Object obj2 = arr.get(2);
		
		//Convert obj2 to JSONObject:
		
		JSONObject o = (JSONObject) obj2;
		String string2 = o.get("id").toString();
		System.out.println(string2);
		
		String string3 = o.get("first_name").toString();
		System.out.println(string3);
	}

}
