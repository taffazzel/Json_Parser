import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;




public class Json_Parser_3 {
	
	
	static List<Employee> emp = new ArrayList();
	public static void convert(String fileName)
	{
		//JsonObject jo=new JsonObject();
		
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader("C:/New folder/data.json"));
			//Reader reader = new InputStreamReader(JsonToJava.class.getResourceAsStream("/Server1.json"), "UTF-8");
			Gson gson = new GsonBuilder().create();
			
			Employee e = gson.fromJson(reader, Employee.class);
			
			System.out.println(e.getFirstName());
			System.out.println(e.getLastName());
			
			//JsonParser jp=new JsonParser();
			//JsonElement je=jp.parse(new FileReader(fileName));
			//jo = je.getAsJsonObject();
			
		}
		catch(FileNotFoundException ie)
		{
			ie.printStackTrace();
		}
		//System.out.println(jo+"\n");
		
		
		/*while(jo.has("firstName"))
		{
			System.out.println(jo.get("firstName"));
		}
		*/
		//return jo;
		
	}
	
	
	public static void main(String a[])
	{
		convert("C:/New folder/data.json");
	}
	
	
	
		
			
}



