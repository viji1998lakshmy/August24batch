package org.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\src\\test\\resources\\TestSample.json");
		FileReader reader = new FileReader(f);
		
		JSONParser parser = new JSONParser();
		Object parse = parser.parse(reader);
		
		JSONObject obj = (JSONObject) parse;
		String string = obj.get("topic").toString();
		
		System.out.println(string);
	}

}
