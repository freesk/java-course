package set_10_project_03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		String res = "";
		
		System.out.println(str);
		
		int i;
		int middleIndex = str.length() / 2 ;
		
		for(i = middleIndex; i < str.length(); i++) {
			res += str.charAt(i);
		}
		
		for(i = 0; i < middleIndex; i++) {
			res += str.charAt(i);
		}
		
		System.out.println(res);
		
		
	}

}
