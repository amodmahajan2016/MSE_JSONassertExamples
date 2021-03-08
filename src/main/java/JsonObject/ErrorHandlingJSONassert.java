package JsonObject;

import org.json.JSONException;
import org.json.JSONObject;
import org.skyscreamer.jsonassert.JSONAssert;
import org.testng.annotations.Test;

public class ErrorHandlingJSONassert {
	
	@Test
	public void errorHandling() throws JSONException {
		
		JSONObject jsonObject1 = new JSONObject();
		jsonObject1.put("firstName", "Amod");
		jsonObject1.put("lastName", "Mahajan");
		
		
		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("firstName", "Rahul");
		jsonObject2.put("lastName", "Mahajan");
		
		try {
		JSONAssert.assertEquals(jsonObject1, jsonObject2, false);
		}catch(Error e)
		{
			System.out.println("Error occured as JSONs are not same.");
		}
	}

}
