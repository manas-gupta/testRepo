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
			JSONParser parser = new JSONParser();
			JSONObject ob = (JSONObject)parser.parse(new FileReader(new File("ques.json")));
			JSONArray ar = (JSONArray)ob.get("questions");
			for(int i=0;i<ar.size();i++)
			{
				System.out.println(ar.get(i));
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
