package collection.set;

import java.util.Arrays;

public class HashStart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] inputArray = new Integer[10];
		inputArray[1] = 1;
		inputArray[2] = 2;
		inputArray[5] = 5;
		inputArray[8] = 8;
		
		System.out.println(Arrays.toString(inputArray));
		
		int searchValue = 8;
		
		System.out.println(inputArray[searchValue]);
		
	}

}
