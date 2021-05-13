package JsonAssert;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

public class AssertTwoJsonArraysLinent {
	
	public static void main(String[] args) throws JSONException {
		
		// same no of elements, values and in same order
		String jsonArray1 = "[\"Amod\",\"Mukesh\",\"Ravi\"]";
		String jsonArray2 = "[\"Amod\",\"Mukesh\",\"Ravi\"]";
		
		//JSONAssert.assertEquals(jsonArray1, jsonArray2, JSONCompareMode.LENIENT);
		
		// Same no of elements but different values
		jsonArray1 = "[\"Amod\",\"Mukesh\",\"Ravi\"]";
		jsonArray2 = "[\"Amod Mahajan\",\"Mukesh\",\"Ravi\"]";
		
		//JSONAssert.assertEquals(jsonArray1, jsonArray2, JSONCompareMode.LENIENT);
		
		// Same no of elements but different case values
		jsonArray1 = "[\"AMOD\",\"Mukesh\",\"Ravi\"]";
		jsonArray2 = "[\"Amod\",\"Mukesh\",\"Ravi\"]";
				
		//JSONAssert.assertEquals(jsonArray1, jsonArray2, JSONCompareMode.LENIENT);
		
		// Same no of elements but different order
		jsonArray1 = "[\"Amod\",\"Mukesh\",\"Ravi\"]";
		jsonArray2 = "[\"Mukesh\",\"Amod\",\"Ravi\"]";
						
		//JSONAssert.assertEquals(jsonArray1, jsonArray2, JSONCompareMode.LENIENT);
		
		// Same no of elements but all different values
		jsonArray1 = "[\"Amod\",\"Mukesh\",\"Ravi\"]";
		jsonArray2 = "[\"Animesh\",\"Aaditya\",\"Swati\"]";
								
		//JSONAssert.assertEquals(jsonArray1, jsonArray2, JSONCompareMode.LENIENT);
		
		// Different no of elements
		jsonArray1 = "[\"Amod\",\"Mukesh\",\"Ravi\"]";
		jsonArray2 = "[\"Amod\",\"Mukesh\",\"Ravi\",\"Animesh\"]";
								
		JSONAssert.assertEquals(jsonArray1, jsonArray2, JSONCompareMode.LENIENT);
	}

}
