package set_09_project_04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr={
				{1,3,2,5},
				{3,4,8,6},
				{2,6,8,1},
				{1,8,5,8}
			};
		
		int index_1 = 1;
		int index_2 = 2;
		
		int tmp = 0;
		int i = 0;
		int j = 0;
		
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		for(i = 0; i < arr.length; i++) {
			tmp = arr[i][index_1];	
			arr[i][index_1] = arr[i][index_2];
			arr[i][index_2] = tmp;
		}
		
		System.out.print("\n");
		
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
		
	}

}
