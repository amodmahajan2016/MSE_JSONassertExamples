package JsonObject;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class LinentMatch {
	
	@Test
	public void exactSameJson() throws JSONException {
		
		String jsoNobject1 = "{\r\n" + 
				"  \"firstName\" : \"Amod\",\r\n" + 
				"  \"lastName\": \"Mahajan\"\r\n" + 
				"}";
		
		String jsonObject2 = "{\r\n" + 
				"  \"firstName\" : \"Amod\",\r\n" + 
				"  \"lastName\": \"Mahajan\"\r\n" + 
				"}";
		
		JSONAssert.assertEquals(jsoNobject1, jsonObject2, JSONCompareMode.LENIENT);
	}
	
	@Test
	public void exactSameJson1() throws JSONException {
		
		String jsoNobject1 = "{\r\n" + 
				"  \"firstName\" : \"Amod\",\r\n" + 
				"  \"lastName\": \"Mahajan\"\r\n" + 
				"}";
		
		String jsonObject2 = "{\r\n" + 
				"  \"lastName\" : \"Mahajan\",\r\n" + 
				"  \"firstName\": \"Amod\"\r\n" + 
				"}";
		
		JSONAssert.assertEquals(jsoNobject1, jsonObject2, JSONCompareMode.STRICT_ORDER);
	}
	
	@Test
	public void matchJsonObject1() throws JSONException {
		
		String jsoNobject1 = "{\r\n" + 
				"  \"firstName\" : \"Amod\",\r\n" + 
				"  \"lastName\": \"Mahajan\"\r\n" + 
				"}";
		
		String jsonObject2 = "{\r\n" + 
				"  \"firstName\" : \"Amod\",\r\n" + 
				"  \"lastName\": \"Mahajan\",\r\n" + 
				"  \"age\": 28\r\n" + 
				"}";
		
		JSONAssert.assertEquals(jsoNobject1, jsonObject2, JSONCompareMode.LENIENT);
		JSONAssert.assertEquals(jsonObject2, jsoNobject1, JSONCompareMode.LENIENT);
	}
	
	@Test
	public void matchJsonObject3() throws JSONException {
		
		String jsoNobject1 = "{\r\n" + 
				"  \"firstName\" : \"Amod\",\r\n" + 
				"  \"lastName\": \"Mahajan\",\r\n" + 
				"  \"age\": \"28\"\r\n" + 
				"}";
		
		String jsonObject2 = "{\r\n" + 
				"  \"firstName\" : \"Amod\",\r\n" + 
				"  \"lastName\": \"Mahajan\",\r\n" + 
				"  \"age\": 28\r\n" + 
				"}";
		
		JSONAssert.assertEquals(jsoNobject1, jsonObject2, JSONCompareMode.LENIENT);
		JSONAssert.assertEquals(jsonObject2, jsoNobject1, JSONCompareMode.LENIENT);
	}

}
