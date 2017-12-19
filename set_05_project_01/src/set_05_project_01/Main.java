package set_05_project_01;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
	
		int year_1 = 2017;
		int month_1 = 11;
		int day_1 = 14;
		
		int year_2 = 2032;
		int month_2 = 12;
		int day_2 = 31;
		
		System.out.println("Enter the first date");
		year_1 = scan.nextInt();
		month_1 = scan.nextInt();
		day_1 = scan.nextInt();

		System.out.println("Enter the second date");		
		year_2 = scan.nextInt();
		month_2 = scan.nextInt();
		day_2 = scan.nextInt();
		
		scan.close();
		
		int packed = 0;
		packed = pack(year_1, month_1, day_1, year_2, month_2, day_2);
		unpack(packed);
	}
	
	
	
	public static void unpack(int packed) {
		
		int year_1 = 0;
		int month_1 = 0;
		int day_1 = 0;
		
		int year_2 = 0;
		int month_2 = 0;
		int day_2 = 0;
		
        // 0x1ff   => 00000000000000000000000111111111
        // 0x1f    => 00000000000000000000000000011111
		
		int the_first_date = packed >> 16;
		
//		System.out.println(Integer.toBinaryString(the_first_date));
		
		year_1 = Integer.parseInt(Integer.toBinaryString(the_first_date >> 9), 2);
		month_1 = Integer.parseInt(Integer.toBinaryString((the_first_date & 0x1ff) >> 5), 2);
		day_1 = Integer.parseInt(Integer.toBinaryString(the_first_date & 0x1f), 2);
		
		int the_second_date = (packed << 16) >> 16;
		
//		System.out.println(Integer.toBinaryString(the_second_date));
		
		year_2 = Integer.parseInt(Integer.toBinaryString(the_second_date >> 9), 2);
		month_2 = Integer.parseInt(Integer.toBinaryString((the_second_date & 0x1ff) >> 5), 2);
		day_2 = Integer.parseInt(Integer.toBinaryString(the_second_date & 0x1f), 2);
		
		
		System.out.print(2000 + year_1);
		System.out.print("-");
		System.out.print(month_1);
		System.out.print("-");
		System.out.print(day_1);
		
		System.out.print("\n");
		
		System.out.print(2000 + year_2);
		System.out.print("-");
		System.out.print(month_2);
		System.out.print("-");
		System.out.print(day_2);
	
	}
	
	public static int pack(int year_1, int month_1, int day_1, int year_2, int month_2, int day_2) {
		int year_1_short = year_1 % 1000;
		int year_2_short = year_2 % 1000;
		
		// year is 7-bit
        // month is 4-bit
        // day is 5-bit

        int packed = 0;

//        System.out.println("year in binary form is " + Integer.toBinaryString(year_1_short));
//        System.out.println("month in binary form is " + Integer.toBinaryString(month_1));
//        System.out.println("day in binary form is " + Integer.toBinaryString(day_1));

        // packing
        packed |= year_1_short;
        packed = packed << 4;
        packed |= month_1;
        packed = packed << 5;
        packed |= day_1;
        
        packed = packed << 7;
        packed |= year_2_short;
        packed = packed << 4;
        packed |= month_2;
        packed = packed << 5;
        packed |= day_2;

        System.out.println("Binary form: " + Integer.toBinaryString(packed));
        
        return packed;
        
	}

}
