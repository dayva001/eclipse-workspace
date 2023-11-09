
public class Main {

	public static void main(String[] args) {
		MyLinkedList<Integer>test = new MyLinkedList<Integer>();
		test.add(4);
		test.add(6);
		System.out.println("Testing first and last nodes");
		System.out.println(test.getFirst());
		System.out.println(test.getLast());
		
		test.add(22);
		test.add(15);
		System.out.println("Testing first and last nodes after adding more nodes");
		System.out.println(test.getFirst());
		System.out.println(test.getLast());
		
		test.add(10);
		test.add(20);
		test.add(42);
		System.out.println("Testing list print:");
		test.printList();
		
		System.out.print("Checking if 54 is in the list: ");
		System.out.println(test.inList(54));
		System.out.print("Checking if 10 is in the list: ");
		System.out.println(test.inList(10));
		
		MyLinkedList<Integer> emptyList = new MyLinkedList<Integer>();
		
		System.out.println("Testing the print of an empty list: ");
		emptyList.printList();
		System.out.print("Testing if 12 is in the empty list: ");
		System.out.println(test.inList(12));
		
		}

}
