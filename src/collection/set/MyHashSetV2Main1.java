package collection.set;

public class MyHashSetV2Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyHashSetV2 set = new MyHashSetV2();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("AB");
		set.add("SET");
		System.out.println(set);
		
		System.out.println("A".hashCode());
		System.out.println("B".hashCode());
		System.out.println("AB".hashCode());
		System.out.println("SET".hashCode());
		
		String searchValue = "SET";
		boolean result = set.contains(searchValue);
		System.out.println(searchValue + "," + result);
	}

}
