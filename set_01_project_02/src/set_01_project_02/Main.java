package set_01_project_02;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 33;
		int num2 = 66;

		while(num1 != num2) {
			if(num1 < num2) {
				num2 = num2 - num1;
			} else {
				num1 = num1 - num2;
			}
		}

		System.out.println(num1);

	}
}
