package set_01_project_04;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;
		int temp;

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        scan.close();

        if(c < b) {
        	temp = b;
        	b = c;
        	c = temp;
        }
        if(b < a) {
        	temp = a;
        	a = b;
        	b = temp;
        }
        if(c < b) {
        	temp = b;
        	b = c;
        	c = temp;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

	}
}
