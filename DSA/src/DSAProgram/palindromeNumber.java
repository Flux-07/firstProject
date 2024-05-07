package DSAProgram;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the number");
	       int number =sc.nextInt();
	       int sum=0;
	       int reference=number;
	    while(reference!=0) {
	    	
	    	 sum=10*sum+reference%10;
	    	 reference=reference/10;
	    }
	 
	  if(number==sum) {
		  System.out.println(number+" is a Palindrome");
	  }
	  else {
		  System.out.println(number+" is not  a Palindrome");
	  }
	
	}

}
