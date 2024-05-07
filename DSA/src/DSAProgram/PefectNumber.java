package DSAProgram;

import java.util.Scanner;

public class PefectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the number");
	     int number = sc.nextInt();
	     int sum=0;
	     for(int i=1;i<=Math.sqrt(number);i++) {
	    	 if(number%i==0) {
	    		  sum=sum+i;
	    		 if(number/i!=i) {
	    			 sum=sum+(number/i);
	    		 }
	    	 }
	     }
	    if(sum-number-number==0) {
	    	System.out.println(number+" is a perfect number");
	    }
	    else {
	    	System.out.println(number+" is not a perfect number");
	    }
	}

}
