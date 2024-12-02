package generic.ex5;

import animal.Animal;
import animal.Cat;
import animal.Dog;

public class WildcardMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Object> objBox = new Box<>();
		Box<Animal> animalBox = new Box<>();
		Box<Dog> dogBox = new Box<>();
		Box<Cat> catBox = new Box<>();
		
		writeBox(objBox);
		writeBox(animalBox);
		
		System.out.println(animalBox.get());
	}
	
	static void writeBox(Box<? super Animal> box) {
		box.set(new Dog("멍멍이", 100));
	}

}
