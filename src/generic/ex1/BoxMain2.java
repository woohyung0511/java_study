package generic.ex1;

public class BoxMain2 {

	public static void main(String[] args) {
		ObjectBox integerBox = new ObjectBox();
		integerBox.set(10);
		Integer integer = (Integer) integerBox.get();
		System.out.println(integer);
		
		ObjectBox stringBox = new ObjectBox();
		stringBox.set("hello");
		String string = (String) stringBox.get();
		System.out.println(string);
	}
}
