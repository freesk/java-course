package set_12_project_01;

import java.lang.IllegalArgumentException;

public class MyString {
	
	private String str;
	
	public MyString() {
		str = "";
	}
	
	public MyString(String str) {
		reset(str);
	}
	
	public int getLength() {
		return str.length();
	}
	
	public char getChar(int n) {
		
		if(n > getLength() || n < 0) {
			throw new IllegalArgumentException("WTF! This number is not gonna work");
		}
		
		return this.str.charAt(n);
	}
	
	public void append(String str) {
		this.str += str;
	}
	
	public void append(int rep, String str) {
		for(int i = 0; i <= rep; i++)
			this.str += str;
	}
	
	public void prepend(String str) {
		reset(str + this.str); 
	}
	
	public void insert(int pos, String str) {
		int i;
		String res = "";
		
		if(pos > 0) {
			for(i = 0; i < pos; i++) {
				res += getChar(i);
			}	
			res += str;
			for(i = pos; i < getLength(); i++) {
				res += getChar(i);
			}
			reset(res);
		} else {
			prepend(str);
		}
		
	}
	
	public void reset(String s) {
		this.str = s;
	}
	
	@Override
	public String toString() {
		return this.str;
	}
	
}
