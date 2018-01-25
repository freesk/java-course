package set_17_project_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.RuntimeException;
import java.lang.IllegalArgumentException;

import set_17_project_01.BracketStack;

public class Main {
	
	private static char getOpposite(char c) {
		if	   (c == ')') return '(';
		else if(c == '(') return ')';
		else if(c == '}') return '{';
		else if(c == '{') return '}';
		else if(c == ']') return '[';
		else if(c == '[') return ']';
		else throw new IllegalArgumentException("ERROR. " + c + " has no opposite character");
	}

	public static void main(String[] args) {
		
		

		
		
		String data = readFile("data.txt");
		
		String lines[] = data.split("\\r?\\n");
		
		BracketStack stack = new BracketStack();
		
		int i, j;
		char c, head;
		
		for(i = 1; i < 6; ++i) {
			if(i == 2) continue;
			System.out.print(i+" ");
			if(i == 4 ) break;
		}
		
		System.out.println("");
		
		String s1 = "M", s2 = "H";
		
		s1 = s2;
		
		System.out.println(s1);
		System.out.println(s2);
		
		String[][] a = { null, {"A", null, "U"}, {"W"}};
		
//		System.out.println(a[0][1].length());
		System.out.println(a[1][0].length());
		
				
		try {
			// Go over every line 
			for(i = 0; i < lines.length; i++) {
				// Go over every character in the line
				for(j = 0; j < lines[i].length(); j++) {					
					// Save current character
					c = lines[i].charAt(j);
					// If opening brackets, push to the stack 
					if (c == '(' || c == '{' || c == '[') {
						stack.push(c);
					// If closing brackets...
					} else if (c == ')' || c == '}' || c == ']') {
						// Get the first element from the stack
						head = stack.pop();
						// If current character does not equal to the opposite of the head, throw an error
						if(c != getOpposite(head)) 
							throw new RuntimeException(
									"ERROR in line " + (i + 1) + ". '" + c + "' found, but '" + getOpposite(head) + "' expected");
						
					}
															
				}
				
			}
			
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}
	

	
	public static String readFile(String path) {
		BufferedReader br;
		String line = "";
		StringBuilder sb;
		String everything = "";
		try {
			br = new BufferedReader(new FileReader(path));
		    sb = new StringBuilder();
		    
		    try {
		    	line = br.readLine();	
		    	
		    	while (line != null) {
		    		sb.append(line);
		    		sb.append(System.lineSeparator());
		    		line = br.readLine();
		    	}
		    	
		    	br.close();
		    	
		    } catch(IOException e) {
		    	System.out.println("Oops. IOException");
		    }
		    
		    everything = sb.toString();
		} catch(FileNotFoundException e) {
			System.out.println("Oops. FileNotFoundException");
		}
		
		return everything;
	}

}
