package generic.ex4;

import animal.Cat;
import animal.Dog;

public class MethodMain3 {

	public static void main(String[] args) {
		Dog dog = new Dog("멍멍이",100);
		Cat cat = new Cat("냐옹이",50);
		
		ComplexBox<Dog> hospital = new ComplexBox<>();
		hospital.set(dog);
		
		System.out.println(hospital.printAndReturn(cat));
	}

}
