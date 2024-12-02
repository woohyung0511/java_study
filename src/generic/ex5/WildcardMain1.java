package generic.ex5;

import animal.Animal;
import animal.Cat;
import animal.Dog;

public class WildcardMain1 {

	public static void main(String[] args) {
		Box<Object> objBox = new Box<>();
		Box<Dog> dogBox = new Box<>();
		Box<Cat> catBox = new Box<>();
		
		dogBox.set(new Dog("멍멍이", 100));
		
		WildcardEx.printGenericV1(dogBox);
		WildcardEx.printGenericV2(dogBox);
		WildcardEx.printAndReturnGeneric(dogBox);
		
		Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
		Animal animal = WildcardEx.printAndReturnGeneric(dogBox);
	}

}
