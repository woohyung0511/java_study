package collection.link;


public class MyLinkedListV1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLinkedListV1 list = new MyLinkedListV1();
		System.out.println("데이터 추가");
		System.out.println(list);
		list.add("a");
		System.out.println(list);
		list.add("b");
		System.out.println(list);
		list.add("c");
		System.out.println(list);
		
		System.out.println("기능 사용");
		System.out.println(list.size());
		System.out.println(list.get(1));
		
		System.out.println(list.indexOf("c"));
		System.out.println(list.set(2, "z"));
		System.out.println(list);
		
		list.add("d");
		System.out.println(list);
		list.add("e");
		System.out.println(list);
		
		list.add("f");
		System.out.println(list);
	}

}
