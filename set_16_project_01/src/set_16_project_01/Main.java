package set_16_project_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import set_16_project_01.RPNStack;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(System.getProperty("user.dir"));
		
		String data = readFile("data.txt");
		
		String lines[] = data.split("\\r?\\n");
		
		RPNStack list;
		
		for(String line : lines) {
			
			list = new RPNStack();
			
			String[] string = line.split(" ");
			
			for(int i = 0; i < string.length; i++) {
			
				double n;
				String s = string[i];
				
				try {
				
					n = Double.parseDouble(s);
					
					list.push(n);					
					
				} catch (IllegalArgumentException e) {
					if(s.equals("+")) {
						double n_1 = list.pop();
						double n_2 = list.pop();
						list.push(n_2 + n_1);
					} else if (s.equals("*")) {
						double n_1 = list.pop();
						double n_2 = list.pop();
						list.push(n_2 * n_1);
					} else if (s.equals("-")) {
						double n_1 = list.pop();
						double n_2 = list.pop();
						list.push(n_2 - n_1);
					} else if (s.equals("/")) {
						double n_1 = list.pop();
						double n_2 = list.pop();
						list.push(n_2 / n_1);
					} else {
						// must be a space, so skip it
					}
				}
				
			}
			
			System.out.println(list.pop());
			
			if(!list.empty()) {
				System.out.println("The stuck still has something inside");
				list.clear();
			}
	
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
		    	System.out.println("Oops. IOException error.");
		    }
		    
		    everything = sb.toString();
		} catch(FileNotFoundException e) {
			System.out.println("Oops. FileNotFoundException error.");
		}
		
		return everything;
	}

}
