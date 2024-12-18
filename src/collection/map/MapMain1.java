package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> studentMap = new HashMap<>();
		
		studentMap.put("studentA", 90);
		studentMap.put("studentB", 80);
		studentMap.put("studentC", 80);
		studentMap.put("studentD", 100);
		
		System.out.println(studentMap);
		
		System.out.println(studentMap.get("studentD"));
		
		System.out.println(studentMap.keySet());
		
		for(String key : studentMap.keySet()) {
			System.out.println(key + "," + studentMap.get(key));
		}
		
		System.out.println(studentMap.entrySet());
		
		System.out.println(studentMap.values());
	}

}
