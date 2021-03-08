package JsonObject;

import org.json.JSONException;
import org.json.JSONObject;
import org.skyscreamer.jsonassert.JSONAssert;
import org.testng.annotations.Test;

public class LinentMatchWithJsonObject {
	
	@Test
	public void matchJsonObject() throws JSONException {
		
		JSONObject jsonObject1 = new JSONObject();
		jsonObject1.put("firstName", "Amod");
		jsonObject1.put("lastName", "Mahajan");
		
		
		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("firstName", "Rahul");
		jsonObject2.put("lastName", "Mahajan");
		
		//JSONAssert.assertEquals(jsonObject1, jsonObject2, false);
		
		JSONAssert.assertEquals("Jsons are not equal", jsonObject1, jsonObject2, false);
	}
}
