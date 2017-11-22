package set_06_project_01;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2, y = 3, z = 1;
		
		System.out.println("Max of " + x + ", " + y + ", " + z + " is " + maxOfThree(x, y, z));
		
		for (int a = 12; a < 16; ++a)
			System.out.println("Greatest divisor of " + a + " is " + greatestDivisor(a));
		
		for (int m = 11, n = 5; m >= 3; m -= 2, n += 2)
			if (areRelativelyPrime(m, n))
				System.out.println(m + " and " + n + " are relatively prime");
		
		for (int m = 2; m <= 100; ++m)
			if (isPerfect(m))
				System.out.println(m + " is perfect");

	}
	
	static int maxOfThree(int _a, int _b, int _c) {
		int a = _a;
		int b = _b;
		int c = _c;
		
		int temp = 0; 

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
        }
        
        return c;
	}
	
	static int greatestDivisor(int n) {
		List<Integer> list = getAllDivisors(n);
		return list.get(list.size() - 1);
	}
	
	static List<Integer> getAllDivisors(int n) {
		int i;
		int number = n;
		List<Integer> list = new ArrayList<>();

		for(i = 1; i < number; i++) {
			int mod_result = number % i;
			if(mod_result == 0) {
				list.add(i);
			}
		}
		
		return list;
	}
	
	static boolean areRelativelyPrime(int a, int b) {
		return ( (greatestDivisor(a) == 1) || (greatestDivisor(b) == 1) ) ? true : false;
	}
	
	static boolean isPerfect(int n) {
		int sum = 0;
		List<Integer> list = getAllDivisors(n);
		for (int i = 0; i < list.size(); i++)
			sum += list.get(i);
		
		return sum == n ? true : false;
	}

}
