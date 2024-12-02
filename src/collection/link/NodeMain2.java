package collection.link;

public class NodeMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node first = new Node("A");
		first.next = new Node("B");
		first.next.next = new Node("C");
		
		System.out.println(first);
	}
}
