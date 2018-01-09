package set_14_project_01;

import set_14_project_01.SingLList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
	    SingLList list = SingLList.arrayToList(arr);
	    list.showList();
		list.removeOdd();
		list.showList();
		list.addFront(1);
		list.addBack(8);
		list.showList();
		System.out.println("contains 3? "+list.contains(3));
		System.out.println("contains 8? "+list.contains(8));
		list.clear();
		list.showList();
	}

}
