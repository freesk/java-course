package set_00_project_11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= n; j++) {
				if(i == 0 || i == n) {
					System.out.print("*");
				} else {
					if(j == 0 || j == n) {
						System.out.print("*");
					} else if (j == (n - i)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}			
			}
			System.out.print("\n");
		}
		
	}

}
