package org.curlybrace.jsonapicalls;

import java.time.LocalDateTime;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

//Main application class for reading JSON data from web service.
public class JsonApiCaller {
	public String readJsonData(String sourceurl) {
		String jsontxt = "";
		
		try {
			URL url = new URL(sourceurl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-Type", "application/json");

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;

			System.out.println("========== " + "data fetch: " + "Time: "+ LocalDateTime.now()+ "==========");
			System.out.println("JSON Response received from server https://postman-echo.com/.... \n");

			while ((output = br.readLine()) != null) {
				jsontxt = jsontxt + output;
			}

			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsontxt;
	}

	public static void main(String[] args) {
		JsonApiCaller j = new JsonApiCaller();
		String jsontxt = j.readJsonData("https://postman-echo.com/get?foo1=bar1&foo2=bar2");
		
		JsonParser parser = new JsonParser();
		JsonObject json = parser.parse(jsontxt).getAsJsonObject();
	
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String prettyJson = gson.toJson(json);		
	  
		System.out.println(prettyJson);
	}
}