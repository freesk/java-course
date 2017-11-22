package set_03_project_02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
	    Scanner scan = new Scanner(System.in);
	    
	    int a = 0;
	    int b = 0;
	    int c = 0;
	    int d = 0;
	    
	    System.out.println("Make sure that a < b and c < d and belong to the following interval [-5, 5]");
	    
	    a = scan.nextInt();
	    b = scan.nextInt();
	    c = scan.nextInt();
	    d = scan.nextInt();
	    
//	    a = -2;
//	    b = 3;
//	    c = 0;
//	    d = 4;
	    
	    scan.close();
	    
	    int i = 0;
	    
	    for(i = -5; i <= 5; i++) {
	    	System.out.println(
	    		(i >= 0 ? "+" : "") + i + ": " + 
	    		"inSum? " + inSum(a, b, c, d, i) + "; " +
	    		"inIntersect? " + inIntersect(a, b, c, d, i) + "; " +
	    		"inSymDiff? " + inSymDiff(a, b, c, d, i) + "; "
	    	);
	    }
		
	}
	
	public static boolean inIntersect(int a, int b, int c, int d, int i) {
		return (i >= c && i <= b);
	}
	
	public static boolean inSymDiff(int a, int b, int c, int d, int i) {
		return ( i >= a && i < c ) || ( i > b && i <= d );
	}
	
	public static boolean inSum(int a, int b, int c, int d, int i) {
		return (i >= a && i <= d);
	}

}
