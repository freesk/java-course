package set_03_project_01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
	    Scanner scan = new Scanner(System.in);
	    
	    int number = 0;
	    int prev = 0;
	    int counter = 0;
	    int number_to_display = 0;
	    int max = 0;
	    boolean isDone = false;
	    
	    while(!isDone) {
	    	number = scan.nextInt();
	    	if(number == 0) {
	    		isDone = true;
	    		break;
	    	}
	    	if(number == prev) {
	    		counter = counter + 1;
	    		if(max <= counter) {
	    			max = counter;
	    			number_to_display = number;
	    		}
	    	} else {
	    		counter = 0;
	    	}
	    	prev = number;
	    }
	    
	    scan.close();
	    
	    System.out.println((max + 1) + " times number " + number_to_display);

	}

}
