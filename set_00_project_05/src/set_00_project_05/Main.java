package set_00_project_05;

import java.math.*;
import java.text.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigDecimal n = new BigDecimal("1234567.892");
		
		System.out.println(formatNumber(n));
		System.out.println(formatNumber(n, true));
	}
	
	private static String formatNumber(BigDecimal n) {
		DecimalFormat df = new DecimalFormat();
		return df.format(n);
	}
	
	private static String formatNumber(BigDecimal n, boolean isCurrency) {
		DecimalFormat df = new DecimalFormat("$#,##0.00");
		return df.format(n);
	}

}
