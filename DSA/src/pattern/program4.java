package pattern;

import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	         System.out.println("Enter the number");
	         int number=sc.nextInt();
	         for(int row=1;row<=number*2-1;row++) {
	        	 int totalCol=(row>number?2*number-row:row);
	        	 for(int col=1;col<=totalCol;col++) {
	        		 System.out.print("*");
	        	}
	        	 System.out.println();
	        	 
	         }
	}

}
