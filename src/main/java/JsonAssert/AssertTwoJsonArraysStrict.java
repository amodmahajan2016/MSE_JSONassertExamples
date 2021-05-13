package JsonAssert;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

public class AssertTwoJsonArraysStrict {
	
	public static void main(String[] args) throws JSONException {
		
		// same no of elements, values and in different order
		String jsonArray1 = "[\"Amod\",\"Mukesh\",\"Ravi\"]";
		String jsonArray2 = "[\"Amod\",\"Anu\",\"Ravikant\"]";
		
		JSONAssert.assertEquals(jsonArray1, jsonArray2, JSONCompareMode.STRICT);
		
	}

}
