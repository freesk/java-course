package set_12_project_01;

import set_12_project_01.MyString;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyString str = new MyString();
		
		str.append(10, "a");
		
		System.out.println(str.toString());
		
		System.out.println(str.getChar(-1));
	}

}
