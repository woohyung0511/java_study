package collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer>{
	
	private int currentIndex = -1;
	private int [] targetArr;
	
	public MyArrayIterator(int [] targetArr) {
		this.targetArr = targetArr;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return currentIndex < targetArr.length -1;
	}
	
	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return targetArr[++currentIndex];
	}
}
