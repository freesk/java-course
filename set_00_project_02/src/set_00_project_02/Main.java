package set_00_project_02;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int size = 100;
		int[] intArray = new int[size];
		int i;
		int temp;
		boolean finished = false;

		for(i = 0; i < intArray.length; i++) {
			intArray[i] = getRandomInt(0, 100);
		}

		for(i = 0; i < intArray.length; i++) {
			System.out.println("Index " + i + ": " + intArray[i]);
		}

		System.out.println("");

		while(!finished) {
			finished = true;
			for(i = 0; i < intArray.length - 1; i++) {
				if(intArray[i] > intArray[i+1]) {
					temp = intArray[i+1];
					intArray[i+1] = intArray[i];
					intArray[i] = temp;
					finished = false;
				}
			}
		}

		for(i = 0; i < intArray.length; i++) {
			System.out.println("Index " + i + ": " + intArray[i]);
		}

	}

	private static int getRandomInt(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
}
