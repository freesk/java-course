package set_09_project_02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr={
			{1,3},
			{3,4,5,8},
			{6,8},
			{1,9,6}
		};
		
		Integer foo[] = new Integer[arr.length];
		
		int maxInRow = 0;
		
		for(int i = 0; i < arr.length; i++) {
			maxInRow = 0;
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > maxInRow) {
					maxInRow = arr[i][j];
				}
			}
			foo[i] = maxInRow;
		}
		
		for(int i = 0; i < foo.length; i++) {
			System.out.println(foo[i]);
		}
		
		
		
	}

}
