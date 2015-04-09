package parsers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ParseJSON
{
	public static void main(String[] args)
	{
		try
		{
			//Get a JSONParser
			JSONParser parser = new JSONParser();
			//Get a JSONObject
			JSONObject ob = (JSONObject)parser.parse(new FileReader(new File("ques.json")));
			//Get the JSONArray from "questions" object
			JSONArray ar = (JSONArray)ob.get("questions");
			for(int i=0;i<ar.size();i++)
			{
				JSONObject ques = (JSONObject)ar.get(i); // Access a JSONArray using get(int index)
				System.out.println(ques.get("Q"));
				System.out.println(ques.get("A")); 
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	}
}