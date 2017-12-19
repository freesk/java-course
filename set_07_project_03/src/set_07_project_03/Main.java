package set_07_project_03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr={2,3,4,3,6,7,6,8,2,9};
		int[]brr={2,3,6,8,1,5};
        	
		for(int i = 0; i < arr.length; i++)
			if(!doesContain(brr, arr[i])) 
				System.out.print(arr[i] + ", ");
		
	}
	
	private static boolean doesContain(int[] arr, int num) {
		boolean boo = false;
		for(int i = 0; i < arr.length; i++)
			if(arr[i] == num) boo = true;
		return boo;
	}

}
