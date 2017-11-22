package set_00_project_10;

import set_00_project_10.OrderedPair;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
		Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");
		Pair<Integer, String>  p3 = new OrderedPair<Integer, String>(8, "Even");
		
		Pair foo[] = new Pair[3];
		
		foo[0] = p1;
		foo[1] = p2;
		foo[2] = p3;
		
		for(int i = 0; i < foo.length; i++) {
			System.out.println(foo[i].getKey());
			System.out.println(foo[i].getValue());
		}
		
	}

}
