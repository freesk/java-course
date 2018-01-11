package set_16_project_01;

public class RPNStack {
	
	private Node top = null;

	public RPNStack() {
		// TODO Auto-generated constructor stub
	}
	
	public void clear() {
		top = null;
	}
	
	public void push(double d) {
		Node n = new Node(d);
		
		if(!empty()) 
			n.next = top;
		
		top = n;
	}
	
	public double pop() {
		
		double val = 0.0;
		
		if(!empty()) {
			val = top.val;
			top = top.next;	
		}
		
		return val;
	}
	
	public boolean empty() {
		return top == null ? true : false; 
	}
	
	private static class Node {
		
		private double val;
		private Node next = null;
		
		Node(double n) {
			val = n;
		}
		
	}
	
	public void showList() {
		Node current;
		
		if(!empty()) {
			current = top;
			
			System.out.print(current.val + " ");
			
			while(current.next != null) {
				current = current.next;
				System.out.print(current.val + " ");
			}
		} 
		
		System.out.print("\n");
	}

}
