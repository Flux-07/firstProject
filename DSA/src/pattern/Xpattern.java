package pattern;

import java.util.Scanner;

public class Xpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         int number=sc.nextInt();
         for(int row=1;row<=number;row++) {
        	for(int col=1;col<=number;col++) {
        		if(row==col || row+col==number+1) {
        			System.out.print("X");
        		}
        		else {
        			System.out.print(" ");
        		}
        	}
        	System.out.println();
         }
	}

}
