package collection.link;

public class NodeMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node first = new Node("A");
		first.next = new Node("B");
		first.next.next = new Node("C");
		
		System.out.println(first);
		
		System.out.println("모든 노드 탐색하기");
		printAll(first);
		
		Node lastNode = getLastNode(first);
		System.out.println(lastNode);
		
		int index = 2;
		Node index2Node = getNode(first, index);
		System.out.println(index2Node);
		
		add(first, "D");
		System.out.println(first);
		
		add(first, "E");
		System.out.println(first);
		
		add(first, "F");
		System.out.println(first);
	}
	
	private static void add(Node node, String param) {
		Node lastNode = getLastNode(node);
		lastNode.next = new Node(param);
	}
	
	private static Node getNode(Node node, int index) {
		Node x = node;
		for(int i=0;i<index;i++) {
			x = x.next;
		}
		
		return x;
	}
	
	private static Node getLastNode(Node node) {
		Node x = node;
		while(x.next != null) {
			x = x.next;
		}
		
		return x;
	}
	
	private static void printAll(Node node) {
		Node x = node;
		while(x != null) {
			System.out.println(x.item);
			x = x.next;
		}
	}

}
