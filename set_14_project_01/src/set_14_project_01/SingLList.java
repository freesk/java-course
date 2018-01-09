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
		if(empty()) {
			System.out.print("Error: The list is empty");
		} else {
			Node current;
			// Shift head element till it is even 
			while(isOdd(head.data)) head = head.next;
			
			//Assign to a temp variable
			current = head;
			
			// Spin till it reaches the last elemnt in the list
			while(current.next != null) {
					
				if(isOdd(current.next.data))
					// Replace the next element with the next next one
					current.next = current.next.next;
				else 
					// Shift current to keep the while running
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
