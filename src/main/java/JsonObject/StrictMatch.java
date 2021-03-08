package JsonObject;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class StrictMatch {
	
	
	@Test
	public void strictMatchExample1() throws JSONException {
		
		String jsoNobject1 = "{\r\n" + 
				"  \"firstName\" : \"Amod\",\r\n" + 
				"  \"lastName\": \"Mahajan\"\r\n" + 
				"}";
		
		String jsonObject2 = "{\r\n" + 
				"  \"firstName\" : \"Amod\",\r\n" + 
				"  \"lastName\": \"Mahajan\",\r\n" + 
				"  \"age\": 28\r\n" + 
				"}";
		
		JSONAssert.assertEquals(jsoNobject1, jsonObject2, JSONCompareMode.STRICT);
	}
	
}
