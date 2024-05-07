package pattern;

import java.util.Scanner;

public class pragrsm10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         int number=sc.nextInt();
         for(int row=1;row<=number;row++) {
        	 for(int col=1;col<=number*2-1;col++) {
        		 if(row+col==number+1 || col-row==number-1) {
        			 System.out.print("*");
        		 }
        		 else if(row==number) {
        			 System.out.print("*");
        		 }
        		 else {
        			 System.out.print(" ");
        		 }
        	 }
        	 System.out.println();
         }
	}

}
