package set_08_project_03;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        int n = 0;
        
//        n = scan.nextInt();
        n = 10;
        
        int middle = n/2;
        
        for(int i = 0; i < n; i++) {
        	if(i == 0 || i == middle) {
        		for(int j = 0; j < n; j++) 
        			System.out.print("*");
    		} else {
    			System.out.print("*");
    		}
        	
        	System.out.print("\n");
        }

	}

}
