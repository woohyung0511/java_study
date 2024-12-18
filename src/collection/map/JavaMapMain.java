package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class JavaMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run(new HashMap<>());
		run(new LinkedHashMap<>());
		run(new TreeMap<>());
	}
	
	private static void run(Map<String, Integer> map) {
		System.out.println(map.getClass());
		map.put("C", 10);
		map.put("B", 20);
		map.put("A", 30);
		map.put("1", 40);
		map.put("2", 50);
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.print(key + "," + map.get(key));
		}
		System.out.println();
	}

}
