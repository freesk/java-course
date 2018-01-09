package set_14_project_01;

public class SingLList {

	private Node head = null; 
	
	public SingLList() {
		// TODO Auto-generated constructor stub
	}
	
	public void addFront(int d) {
		Node n = new Node(d);
		
		if(empty()) {
			head = n;
		} else {
			n.next = head;
			head = n;
		}
		
	}
	
	public static SingLList arrayToList(int[] arr) {
		SingLList list = new SingLList();
		
		for(int i = 0; i < arr.length; i++) 
			list.addBack(arr[i]);
		
		return list;
	}
	
	public void clear() {
		head = null;
	}
	
	public boolean contains(int d) {
		Node current;
		boolean b = false;
		
		if(empty()) {
			System.out.print("Error: The list is empty");
		} else {
			current = head;
			
			if(current.data == d)
				b = true;
			
			while(current.next != null) {
				current = current.next;
				if(current.data == d)
					b = true;
			}
				
		}	
		
		return b;
	}
	
	public void removeOdd() {
		Node current;
		
		if(empty()) {
			System.out.print("Error: The list is empty");
		} else {
			current = head;
			
			if(isOdd(head.data)) {
				head = head.next;
			}
			
			
			while(current.next != null) {
					
				if(isOdd(current.next.data)) {
					current.next = current.next.next;
				}
					
				if(current.next != null)
					current = current.next;
					
			}	

		
				
		}	
	}
	
	private boolean isOdd(int n) {
		return (n % 2) > 0;
	}
	
	public void addBack(int d) {
		Node n = new Node(d);
		Node current;
		
		if(empty()) {
			head = n;
		} else {
			current = head;
			while(current.next != null)
				current = current.next;
			current.next = n;
		}
	}
	
	public void showList() {
		Node current;
		
		if(empty()) {
			System.out.print("Error: The list is empty");
		} else {
			current = head;
			
			System.out.print(current.data + " ");
			
			while(current.next != null) {
				current = current.next;
				System.out.print(current.data + " ");
			}
				
		}
		
		System.out.print("\n");
	}
	
	public boolean empty() {
		return head == null ? true : false; 
	}
	
	private static class Node {
		
		private int data;
		private Node next = null;
		
		Node(int n) {
			data = n;
		}
		
	}


}
