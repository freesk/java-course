package set_07_project_02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2,3,4,3,6,7,6,8,2,9,1 };
        int[] brr = { 2,3,6,8,5,1,1 };

        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        	
        boolean hasDuplicate = false;
        	
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < brr.length; j++) {
				if(arr[i] == brr[j]) {
					
					hasDuplicate = false;
					
					for(k = i + 1; k < arr.length; k++) {
						if(arr[i] == arr[k]) hasDuplicate = true;
					}
					
					for(l = j + 1; l < brr.length; l++) {
						if(brr[j] == brr[l]) hasDuplicate = true;
					}
					
					if(!hasDuplicate)
						System.out.print(arr[i] + ", ");
				}
			}
		}
		
		System.out.print("\n");
        
	}

}
