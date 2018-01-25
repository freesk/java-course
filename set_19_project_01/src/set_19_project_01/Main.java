package set_19_project_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList; 
import java.util.LinkedList; 
import java.util.HashMap; 
import java.util.HashSet; 
import java.util.Map; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = readFile("data.txt");
		
		String lines[] = data.split("\\r?\\n");
		
		Purchase p;
		
		Map<String, LinkedList<Purchase>> map = new HashMap<String, LinkedList<Purchase>>();
		
		for(String line : lines) {
			
			String keys[] = line.split("\\s");
			
			double n = 0.0;
			String name = keys[0];
			
			try {
				n = Double.parseDouble(keys[2]);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
			
			p = new Purchase(n, keys[1]);

			
			if(!map.containsKey(name)) {
				LinkedList<Purchase> l = new LinkedList<Purchase>();
				map.put(name, l);
			} 
			
			map.get(name).add(p);
			
			
		}
		
		
		for (String name: map.keySet()) {
			
			String key = name;
			LinkedList<Purchase> l = map.get(name);
			int number_of_purchases = l.size();
			
			int i;
			
			double sum = 0.0;
			for(i = 0; i < l.size(); i++) {
				sum += l.get(i).price;
			}
			    
			ArrayList<String> s = new ArrayList<String>();
			
			for(i = 0; i < l.size(); i++)
			    s.add(l.get(i).name);
			
			HashSet<String> uniques = new HashSet<>(s);
			
			int number_of_unique_purchases = uniques.size();
			
			System.out.println(name + " " + 
							   number_of_purchases + " " + 
							   number_of_unique_purchases + " " + 
							   sum);
			

		} 
		
	}
	
	private static class Purchase {
		
		private double price;
		private String name;
		
		public Purchase(double p, String name) {
			this.price = p;
			this.name = name;
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

