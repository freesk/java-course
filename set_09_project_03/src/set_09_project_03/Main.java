package set_09_project_03;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][]arr=
			{{"Germany","2","Scotland","1"},
			{"Poland","2","Germany","0"},
			{"Germany","1","Ireland","1"},
			{"Poland","2","Scotland","2"},
			{"Scotland","1","Ireland","0"},
			{"Ireland","1","Poland","1"},
			{"Ireland","1","Scotland","1"},
			{"Germany","3","Poland","1"},
			{"Scotland","2","Germany","3"},
			{"Ireland","1","Germany","0"},
			{"Scotland","2","Poland","2"},
			{"Poland","2","Ireland","1"}};
		
		// Define a two-dimensional list 
		ArrayList<ArrayList<String>> score_list = new ArrayList<ArrayList<String>>();
		// Define an inner list 
		ArrayList<String> foo = new ArrayList<String>();
		
		int i;
		
		// Go over the given array 
		for(i = 0; i < arr.length; i++) {
			boolean a = false;
			
			// If the left hand side team doesn't exist in the list, add it
			for(ArrayList<String> currentList : score_list) {  
				if(currentList.get(0) == arr[i][0]) a = true;
			} 
			
			if(!a) {
				foo = new ArrayList<String>();
				foo.add(arr[i][0]);
				foo.add("0");
				score_list.add(foo);
			}
			
			// Reset to false 
			a = false;
			
			// If the right hand side team doesn't exist in the list, add it 
			for(ArrayList<String> currentList : score_list) {  
				if(currentList.get(0) == arr[i][2]) a = true;
			} 
			
			if(!a) {
				foo = new ArrayList<String>();
				foo.add(arr[i][2]);
				foo.add("0");
				score_list.add(foo);
			}
				
		}
		
		int n, index_1, index_2;
		String team_1, team_2, s;
		
		// Go over the list again 
		for(i = 0; i < arr.length; i++) {
			// Save references to teams 
			team_1 = arr[i][0];
			team_2 = arr[i][2];
			// Get the score 
			index_1 = getResultIndex(arr[i][1], arr[i][3]);
			index_2 = getResultIndex(arr[i][3], arr[i][1]);
			
			// Debug
			System.out.println(team_1 + " VS " + team_2);
			System.out.println(team_1 + " gets " + index_1 + " points");
			System.out.println(team_2 + " gets " + index_2 + " points");
			System.out.println("");
			
			// Go over the score list to find team_1 and team_2
			for(ArrayList<String> team : score_list) {
				
				// Calculate and assign new score for team_1 
				if(team.get(0).equals(team_1)) {
					n = getInt(team.get(1));
					s = Integer.toString(n + index_1);
					team.set(1, s); 
				}
				
				// Calculate and assign new score for team_2
				if(team.get(0).equals(team_2)) {
					n = getInt(team.get(1));
					s = Integer.toString(n + index_2);
					team.set(1, s); 
				}

		    }
			
		}
		
		// Print calculated score for each team 
		for(ArrayList<String> currentList : score_list) {  
		    System.out.println(currentList.get(0) + " : " + currentList.get(1));
		} 
		
	}

	// Simply parse String to Integer 
	private static int getInt(String str) {
		return Integer.parseInt(str);
	}
	
	// Conditions for calculating the score 
	private static int getResultIndex(String str_1, String str_2) {
		int index = 0;
		if(getInt(str_1) > getInt(str_2))
			index = 3;
		if(getInt(str_1) == getInt(str_2))
			index = 1;
		return index;
	}

}

