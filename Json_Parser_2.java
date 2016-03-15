import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;




public class Json_Parser_2 {
	
	public static JsonObject convert(String fileName)
	{
		JsonObject jo=new JsonObject();
		
		try
		{
			JsonParser jp=new JsonParser();
			JsonElement je=jp.parse(new FileReader(fileName));
			jo = je.getAsJsonObject();
			
		}
		catch(FileNotFoundException ie)
		{
			ie.printStackTrace();
		}
		System.out.println(jo+"\n");
		
		return jo;
		
	}
	
	
	public static void main(String a[])
	{
		convert("C:/New folder/data.json");
	}
		

}
