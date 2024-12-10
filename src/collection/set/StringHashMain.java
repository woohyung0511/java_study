package collection.set;

public class StringHashMain {
	
	static final int CAPACITY = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char charA = 'A';
		char charB = 'B';
		System.out.println((int)charA);
		System.out.println((int)charB);
		
		System.out.println(hashCode("A"));
		System.out.println(hashCode("B"));
		System.out.println(hashCode("AB"));
		
		System.out.println(hashIndex(hashCode("A")));
		System.out.println(hashIndex(hashCode("B")));
		System.out.println(hashIndex(hashCode("AB")));
	}

	static int hashCode(String str) {
		char[] cahrArray = str.toCharArray();
		int sum = 0;
		for(char c : cahrArray) {
			sum = sum + (int) c;
		}
		return sum;
	}
	
	static int hashIndex(int value) {
		return value% CAPACITY;
	}
}
