package generic.ex5;

import animal.Animal;

public class WildcardEx {
	
	static <T> void printGenericV1(Box<T> box) {
		System.out.println(box.get());
	}
	
	static <T extends Animal> void printGenericV2(Box<T> box) {
		T t = box.get();
		System.out.println(t.getName());
		t.getSize();
	}
	
	static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
		T t = box.get();
		System.out.println(t.getName());
		return t;
	}
}
