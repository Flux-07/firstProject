package DSAProgram;

import java.util.Scanner;

public class leapYearWithoutModule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the year");
		int year=sc.nextInt();
		if( ((year/4)*4==year &&(year/100)*100!=year) || (year/400)*400==year) {
			System.out.println(year+" is a leap year");
		}
		else {
			System.out.println(year+" is not a leap year");
		}
		  
	}

}
