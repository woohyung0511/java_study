package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> studentMap = new HashMap<>();
		
		studentMap.put("studentA", 90);
		System.out.println(studentMap);
		
		studentMap.put("studentA", 100);
		System.out.println(studentMap);
		
		System.out.println(studentMap.containsKey("studentA"));
		
		studentMap.remove("studentA");
		System.out.println(studentMap);
	}

}
