package pattern;

import java.util.Scanner;

public class program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	         System.out.println("Enter the number");
	         int number=sc.nextInt();
	         for(int row=1;row<=2*number;row++) {
	        	 int totalspace=(row>number?number*2-row:row-1);
	        	 int totalCol=(row>number?row-number:number-row+1);
	        	 
	        	 for(int space=1;space<=totalspace;space++) {
	        		 System.out.print(" ");
	        	 }
	        	 for(int col=1;col<=totalCol;col++) {
	        		 System.out.print("*"+" ");
	        	 }
	        	 System.out.println();
	         }
	}

}
