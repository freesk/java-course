package set_08_project_01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int arr[][] = {
				{2, 3, 5, 6, 9, 20},
				{9, 9, 3, 6, 8, 11},
				{2, 3, 5, 6, 9, 20},
				{2, 3, 5, 6, 9, 20},
				{2, 3, 5, 6, 9, 20},
				{2, 3, 5, 6, 9, 20},
				{2, 3, 5, 6, 9, 20},
				{2, 3, 5, 6, 9, 20}
		};
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i == 1) sum += arr[i][j];
			}
		}
		
		System.out.println(sum);
			
		
	}

}
