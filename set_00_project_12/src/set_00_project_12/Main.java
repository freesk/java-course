package set_00_project_12;

import java.io.IOException;
import java.lang.IllegalArgumentException;
import set_00_project_12.MyException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo();
		try {
			boo();
			moo();
		} catch (IOException | IllegalArgumentException e) {
			System.out.println(e.toString());
		}
		
		try {
			roo();
		} catch (MyException e) {
			System.out.println(e.toString());
		}
		
//		assert true : "assert";
		
	}
	
	public static void foo() {
		try {
			bar();
		} catch (IOException e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}

	public static void boo() throws IOException {
		bar();
	}
	
	public static void moo() throws IllegalArgumentException {
		throw new IllegalArgumentException("WTF");
	}
	
	public static void roo() throws MyException {
		throw new MyException("WTF");
	}
	
	public static void bar() throws IOException {
		throw new IOException("WTF");
	}

}

