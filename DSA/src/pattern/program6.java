package pattern;

import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        for(int row=number;row>=1;row--) {
        	
        	for(int space=1;space<=number-row;space++) {
        		System.out.print(" ");
        	}
        	for(int col=1;col<=row*2-1;col++) {
        		System.out.print("*");
        	}
        	
        	
        	System.out.println();
        }
	}

}
