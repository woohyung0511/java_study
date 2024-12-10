package collection.set;

public class MyHashSetV3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MySet<String> set = new MyHashSetV3<>(10);
		set.add("A");
		set.add("B");
		set.add("C");
		System.out.println(set);
		
		String searchValue = "A";
		boolean result = set.contains(searchValue);
		System.out.println(searchValue + "," + result);
		
	}

}
