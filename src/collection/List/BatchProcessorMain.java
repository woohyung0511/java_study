package collection.List;

public class BatchProcessorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MyArrayList<Integer> list = new MyArrayList<>();
		MyLinkedList<Integer> list = new MyLinkedList<>();
		
		BatchProcessor processor = new BatchProcessor(list);
		processor.logic(50_000);
	}

}
