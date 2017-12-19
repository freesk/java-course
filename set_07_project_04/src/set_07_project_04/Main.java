package set_07_project_04;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][]arr=
			{
				{"Kenya","Nairobi"},
				{"Rwanda","Kigali"},
				{"Gambia","Banjul"},
				{"Ghana","Accra"},
				{"Niger","Niamey"},
				{"Zambia","Lusaka"}
			};
		
	    Object[] options = { "OK", "CANCEL" };
	    String country = "";
	    String capital = "";

		country = JOptionPane.showInputDialog("Enter the country you are looking for");
		System.out.println(country);
		
		
		for(int i = 0; i < arr.length; i++)
			if(arr[i][0].equals(country)) 
				capital = arr[i][1];
		
		System.out.println(capital);
			
		JOptionPane.showOptionDialog(null, capital, "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		
		
	}

}
