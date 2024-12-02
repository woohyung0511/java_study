package generic.ex2;

import animal.Animal;
import animal.Cat;
import animal.Dog;

public class AnimalMain2 {

	public static void main(String[] args) {
		Animal animal = new Animal("동물", 0);
		Dog dog = new Dog("멍멍이", 100);
		Cat cat = new Cat("냐옹이", 50);
		
		Box<Animal> animalBox = new Box<>();
		animalBox.set(animal);
		animalBox.set(dog);
		animalBox.set(cat);
		
		System.out.println(animalBox.get());
	}

}
