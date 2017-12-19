package set_10_project_05;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fiboR(45));
		System.out.println(fiboI(45));
		System.out.println(factR(10));
		System.out.println(factI(10));
		System.out.println(gcdR(12125,40643));
		System.out.println(gcdI(12125,40643));

		
		int[] a = {3,8,2,9,7};
		System.out.println(maxElem(a, 0, a.length));
		
		reverse(a, 0, a.length);
		
		for(int i : a) {
			System.out.print(i + ", ");
		}
		
		System.out.println("");
		
	}
	
	public static int fiboR(int n) {
		if(n < 2) return n;
		return fiboR(n-1) + fiboR(n-2);
	}
	
	public static int fiboI(int n) {
		if(n < 2) return n;
		
		int Fib1 = 0;
		int Fib2 = 1;
		int sum = 1;
		
		for(int i = 0; i < n; i++) {
			Fib1 = Fib2;
			Fib2 = sum;
			sum = Fib1 + Fib2;
		}
		
		return Fib1;
	}
	
	public static int factR(int n) {
		if(n < 2) return n;
		return n * factR(n-1);
	}
	
	public static int factI(int n) {
		if(n < 2) return n;
		
		int sum = 1;
		
		for(int i = n; i > 1; i--) {
			sum = sum * i;
		}
		
		return sum;
	}
	
	public static int gcdR(int a, int b) {
		if(a == b) return a;
		if(a > b) {
			a = a-b;
		} else if (a < b) {
			b = b-a;
		}
		return gcdR(a, b);
	}
	
	public static int gcdI(int a, int b) {
		while(a != b) {
			if(a < b) {
				b = b - a;
			} else {
				a = a - b;
			}
		}
		return a;
	}
	
//	int[] a = {3,8,2,9,7};
	public static int maxElem(int[] arr, int from, int to) {
		if(from < to) {
			return Math.max(arr[from], maxElem(arr, from + 1, to - 1));	
		} else {
			return Math.max(arr[from], arr[to - 1]);	
		}
	}
	
	public static void reverse(int[] arr, int from, int to) {
		int temp;
		if(from < to) {
			Math.max(arr[from], maxElem(arr, from + 1, to - 1));	
		} else {
			temp = arr[from];
			arr[from] = arr[to];
			arr[to] = temp;	
		}
	}
	
	
}
