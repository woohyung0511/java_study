package generic.ex3;

import animal.Cat;
import animal.Dog;

public class AnimalHospitalMainV3 {

	public static void main(String[] args) {
		AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
		AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
		
		Dog dog = new Dog("멍멍이1",100);
		Cat cat = new Cat("냐옹이1",300);
		
		dogHospital.set(dog);
		dogHospital.checkup();
		
		catHospital.set(cat);
		catHospital.checkup();
		
		//dogHospital.set(cat);
		
		dogHospital.set(dog);
		Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
		System.out.println(biggerDog);
	}

}
