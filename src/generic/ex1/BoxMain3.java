package generic.ex1;

public class BoxMain3 {

	public static void main(String[] args) {
		GenericBox<Integer> integerBox = new GenericBox<Integer>();
		integerBox.set(10);
		Integer integer = integerBox.get();
		
		GenericBox<String> stringBox = new GenericBox<String>();
		stringBox.set("hello");
		String str = stringBox.get();
	}

}
