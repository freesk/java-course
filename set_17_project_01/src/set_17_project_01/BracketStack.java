package set_17_project_01;

import java.lang.RuntimeException;

public class BracketStack {

	private Node top = null;

	public BracketStack() {}
	
	public void clear() {
		top = null;
	}
	
	public void push(char c) {
		Node n = new Node(c);
		
		if(!empty()) 
			n.next = top;
		
		top = n;
	}
	
	public char pop() {
		
		char c;
		
		if(empty()) throw new RuntimeException(); 
		
		c = top.c;
		top = top.next;
		
		return c;
	}
	
	public boolean empty() {
		return top == null ? true : false; 
	}
	
	private static class Node {
		
		private char c;
		private Node next = null;
		
		Node(char c) {
			this.c = c;
		}
		
	}

}
