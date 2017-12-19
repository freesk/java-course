package set_09_project_01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr={
			{1,3,2},
			{3,4,8},
			{2,6,8},
			{1,8,5}
		};
		int sum = 0;
		int max = 0;
		int row = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			sum = 0;
			
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			
			if(sum > max) {
				max = sum;
				row = i;
			}
			
		}
		
		System.out.println(row);
		
	}

}
