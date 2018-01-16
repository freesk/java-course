package set_17_project_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import set_17_project_01.BracketStack;

public class Main {

	public static void main(String[] args) {
		
		String data = readFile("data.txt");
		
		String lines[] = data.split("\\r?\\n");
		
		BracketStack stack = new BracketStack();
		
		int i, j;
		char c;
		String line;
		
		for(i = 0; i < lines.length; i++) {
			
			line = lines[i];
			
			for(j = 0; j < line.length(); j++) {
				
				c = line.charAt(j);
				
					stack.push(c);
					
					if(c == '(' && stack.getLast() == ')') {
						stack.pop();
						stack.pick();
					} 
					
					else if(c == '{' && stack.getLast() == '}') {
						stack.pop();
						stack.pick();
					}
						
					
					else if(c == '[' && stack.getLast() == ']'){
						stack.pop();
						stack.pick();
					}
						

			

			}
			
		
		}
		
		stack.showList();
		 

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
		    	System.out.println("Oops. IOException error.");
		    }
		    
		    everything = sb.toString();
		} catch(FileNotFoundException e) {
			System.out.println("Oops. FileNotFoundException error.");
		}
		
		return everything;
	}

}
