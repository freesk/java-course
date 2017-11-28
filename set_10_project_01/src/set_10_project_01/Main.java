package set_10_project_01;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a = {
				{1,2,3,4,5,6},
				{2,3,4,5,6,7},
				{3,4,5,6,7,8},
				{4,5,6,7,8,9}
		};
		
		for(int[]r:a)
			System.out.println(Arrays.toString(r));
			System.out.println();
		
//		int[][]inner = new int[a.length - 2][a[0].length - 2];
			
		int[][]b = getInner(a, a.length, a[0].length); 
		
		for(int[]r:b)
			System.out.println(Arrays.toString(r));
	}	
	
	private static int[][] getInner(int[][] outer, int w, int h) {
		
		int[][] inner = new int[w - 2][h - 2];
		
		for(int i = 1; i < outer.length - 1; i++) {
			int[] row = new int[h - 2];
			for(int j = 1; j < outer[i].length - 1; j++) {
				row[j - 1] = outer[i][j];
			}
			inner[i - 1] = row;
		}
		
		return inner;
	}

}
