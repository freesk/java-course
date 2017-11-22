package set_06_project_02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 5, 8, 2, 6};
		int max = 0;
		int i = 0;
		
		while(sumOfItems(arr) > 0) {
			
			max = 0;
			
			for(i = 0; i < arr.length; i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			
			for(i = 0; i < arr.length; i++) {
				if(arr[i] == max) {
					System.out.print("* ");
					arr[i] = arr[i] - 1;
				} else {
					System.out.print("  ");
				}
			}
			
			System.out.print("\n");
			
		}
		
	}
	
	public static int sumOfItems(int[] arr) {
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++)
			sum += arr[i];
		
		return sum;
	}

}
