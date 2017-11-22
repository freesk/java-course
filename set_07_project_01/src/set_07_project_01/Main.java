package set_07_project_01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2,3,4,3,6,7,6,8,2,9 };
		
		int i = 0;
		int size = arr.length;
		int temp;
		boolean finished = false;
		
		for(i = 0; i < size; i++)
			System.out.print(arr[i] + (i < size - 1 ? "," : "" ));
		
		System.out.print("\n");

		while(!finished) {
			finished = true;
			for(i = 0; i < size - 1; i++) {
				if((!isEven(arr[i])) && isEven(arr[i+1])) {
					temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
					finished = false;
				}
			}
		}
		
		for(i = 0; i < size; i++)
			System.out.print(arr[i] + (i < size - 1 ? "," : "" ));
		
		System.out.print("\n");
		
		
	}
	
	private static boolean isEven(int number) {
		return (number % 2) > 0 ? false : true; 
	}

}
