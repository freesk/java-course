package set_10_project_02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][]opers={
				{
					{100,-50,25},
					{150,-300},
					{300,-90,100}
				},
				{
					{90,-60,250},
					{300,20,-100}
				},
				{
					{20,50},
					{300},
					{20,-20,40},
					{100,-200}
				}
		};
		
		int[] customers = new int[opers.length];
		
		for(int i = 0; i < opers.length; i++) {
			int sum = 0;
			
			for(int j = 0; j < opers[i].length; j++) {
				for(int k = 0; k < opers[i][j].length; k++) {
					sum += opers[i][j][k];
				}
			}
			
			customers[i] = sum;
			
		}
		
		for(int l = 0; l < customers.length; l++) {
			System.out.println(customers[l]);
		}
			
		
		
	}

}
