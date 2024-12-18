package collection.compare;

import java.util.Arrays;

public class SortMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUser myUser1 = new MyUser("a", 30);
		MyUser myUser2 = new MyUser("b", 20);
		MyUser myUser3 = new MyUser("c", 10);
		
		MyUser[] array = {myUser1,myUser2,myUser3};
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array, new IdComparator());
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array, new IdComparator().reversed());
		System.out.println(Arrays.toString(array));
	}
}
