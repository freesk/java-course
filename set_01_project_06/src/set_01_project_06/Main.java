package set_01_project_06;

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

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        scan.close();

        int intArray[] = {a, b, c};
		int i;
		int temp;
		boolean finished = false;

		while(!finished) {
			finished = true;
			for(i = 0; i < intArray.length - 1; i++) {
				if(intArray[i] > intArray[i+1]) {
					temp = intArray[i+1];
					intArray[i+1] = intArray[i];
					intArray[i] = temp;
					finished = false;
				}
			}
		}

		int middleIndex = intArray.length/2;

        System.out.println(intArray[middleIndex]);


	}
}
