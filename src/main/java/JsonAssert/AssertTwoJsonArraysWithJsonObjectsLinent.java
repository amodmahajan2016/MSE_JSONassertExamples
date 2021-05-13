package JsonAssert;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.JSONParser;

public class AssertTwoJsonArraysWithJsonObjectsLinent {
	
	public static void main(String[] args) throws JSONException {
		
		// When you have same no of elements and values
		String jsonArray1 = "[\r\n" + 
				"  {\r\n" + 
				"    \"name\": \"Amod\",\r\n" + 
				"    \"city\": \"KA\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"name\": \"Animesh\",\r\n" + 
				"    \"city\": \"GA\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"name\": \"Ravi\",\r\n" + 
				"    \"city\": \"UP\"\r\n" + 
				"  }\r\n" + 
				"]";
		String jsonArray2 = "[\r\n" + 
				"  {\r\n" + 
				"    \"name\": \"Amod\",\r\n" + 
				"    \"city\": \"KA\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"name\": \"Animesh\",\r\n" + 
				"    \"city\": \"GA\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"name\": \"Ravi\",\r\n" + 
				"    \"city\": \"UP\"\r\n" + 
				"  }\r\n" + 
				"]";
		
		JSONAssert.assertEquals(jsonArray1, jsonArray2, JSONCompareMode.LENIENT);
		
		jsonArray1 = "[\r\n" + 
				"  {\r\n" + 
				"    \"name\": \"Amod\",\r\n" + 
				"    \"city\": \"KA\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"name\": \"Animesh\",\r\n" + 
				"    \"city\": \"UP\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"name\": \"Ravi\",\r\n" + 
				"    \"city\": \"GA\"\r\n" + 
				"  }\r\n" + 
				"]";
		jsonArray2 = "[\r\n" + 
				"  {\r\n" + 
				"    \"name\": \"Amod\",\r\n" + 
				"    \"city\": \"KA1\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"name\": \"Animesh\",\r\n" + 
				"    \"city\": \"GA\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"name\": \"Ravi\",\r\n" + 
				"    \"city\": \"UP\"\r\n" + 
				"  }\r\n" + 
				"]";
		
		JSONAssert.assertEquals(jsonArray1, jsonArray2, JSONCompareMode.LENIENT);
		
		
	}

}
