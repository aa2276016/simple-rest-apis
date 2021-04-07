package com.example.simplerestapis.models;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import java.io.FileReader;





public class RequestOneItemFromDatabase {
	/*
	public void initData() {
		JSONParser parser = new JSONParser();
		try {
			JSONArray array1 = (JSONArray)parser.parse(new FileReader("//src/main/resourses/datahubio_oscar_data_json.json"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/

	public JSONObject getDataByIdx(int idx) {
		
		JSONParser parser = new JSONParser();
		JSONArray array1 = new JSONArray();
		try {
			String fileName = this.getClass().getClassLoader().getResource("datahubio_oscar_data_json.json").getPath();
			array1 = (JSONArray)parser.parse(new FileReader(fileName));
			/*
			 * array1 = (JSONArray)parser.parse("[\r\n" + "  {\r\n" +
			 * "    \"category\": \"ACTOR\",\r\n" +
			 * "    \"entity\": \"Richard Barthelmess\",\r\n" + "    \"winner\": false,\r\n"
			 * + "    \"year\": 1927\r\n" + "  },\r\n" + "  {\r\n" +
			 * "    \"category\": \"ACTOR\",\r\n" + "    \"entity\": \"Emil Jannings\",\r\n"
			 * + "    \"winner\": true,\r\n" + "    \"year\": 1927\r\n" + "  }]");
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
		JSONObject obj2=(JSONObject)array1.get(idx);
		System.out.print(obj2.toString());
		
		return obj2;
	}
}




