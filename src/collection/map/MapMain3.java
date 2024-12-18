package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> studentMap = new HashMap<>();
		
		studentMap.put("studentA", 50);
		System.out.println(studentMap);
		
		if(!studentMap.containsKey("studentA")) {
			studentMap.put("studnetA", 100);
		}
		
		System.out.println(studentMap);
		
		studentMap.putIfAbsent("studentA", 100);
		studentMap.putIfAbsent("studentB", 100);
		
		System.out.println(studentMap);
	}

}
