package set_08_project_02;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        String string_1 = "Hello";
        String string_2 = "Java";
        
//        while(string_1.equals("")) {
//			System.out.println("Enter the first string");
//			string_1 = scan.next();	
//		}
//        
//        while(string_2.equals("")) {
//			System.out.println("Enter the first string");
//			string_2 = scan.next();	
//		}
        
        
        int string_1_length = string_1.length();
        int string_2_length = string_2.length();
        
        String text_line = "* " + string_1 + " * " + string_2 + " *";
        
        for(int i = 0; i < 5; i++) {
        	for(int j = 0; j < text_line.length(); j++) {
        		if(i == 0 || i == 4) {
        			System.out.print("*");
        		}
        		else if(i == 1 || i == 3) {
        			if(j == 0 || j == (string_1_length + 3) || j == (text_line.length() - 1))
        				System.out.print("*");
        			else 
        				System.out.print(" ");
        		}
        		else {
        			System.out.print(text_line.charAt(j));
        		}
        	}
        	System.out.print("\n");
        }
        
        scan.close();
		
	}

}
