package collection.compare;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortMain5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUser myUser1 = new MyUser("a", 30);
		MyUser myUser2 = new MyUser("b", 20);
		MyUser myUser3 = new MyUser("c", 10);
		
		TreeSet<MyUser> treeSet1 = new TreeSet<>();
		treeSet1.add(myUser1);
		treeSet1.add(myUser2);
		treeSet1.add(myUser3);
		
		System.out.println(treeSet1);
		
		TreeSet<MyUser> treeset2 = new TreeSet<>(new IdComparator());
		treeset2.add(myUser1);
		treeset2.add(myUser2);
		treeset2.add(myUser3);
		
		System.out.println(treeset2);
	}
}
