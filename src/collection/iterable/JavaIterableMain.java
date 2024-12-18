package collection.iterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class JavaIterableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Iterator<Integer> listIter = list.iterator();
		
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		
		printAll(list.iterator());
		printAll(set.iterator());
		
		foreach(list);
		foreach(set);
	}
	
	private static void foreach(Iterable<Integer> iterable) {
		System.out.println(iterable.getClass());
		for(Integer i : iterable) {
			System.out.println(i);
		}
	}
	
	private static void printAll(Iterator<Integer> iterator) {
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
