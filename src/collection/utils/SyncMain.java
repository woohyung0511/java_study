package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list.getClass());
		List<Integer> synchronizedList = Collections.synchronizedList(list);
		System.out.println(synchronizedList.getClass());
	}

}
