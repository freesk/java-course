package set_00_project_03;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> inputArray = Arrays.asList(9, 9, 9);
		List<Integer> outputArray = new ArrayList<>();

		int num = 0;
		int i = 0;
		
		for(Integer integer : inputArray) {
			num += integer;
			if(i != inputArray.size() - 1) num *= 10;
			i++;
        }
		
		inputArray.forEach(s->System.out.println(s));
		
		num += 1;
		
		while(num > 0) {			
			outputArray.add(0, num % 10);
			num = num/10;
		}
		
		outputArray.forEach(s->System.out.println(s));
		

	}

}
