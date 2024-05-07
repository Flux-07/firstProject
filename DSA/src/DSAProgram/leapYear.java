package DSAProgram;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the year");
		  int year=sc.nextInt();
		  if(year%4==0) {
			  if(year%100!=0) {
				  System.out.println(year+" is leap year");
			  }
		  }
		  else if(year%400==0) {
			  System.out.println(year+" is leap year");
		  }
		  else {
           System.out.println(year+" is not leap  year");
		  }
	}

}
