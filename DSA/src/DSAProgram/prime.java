//prime number program

package DSAProgram;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the number one");
	       int num1=sc.nextInt();
	       boolean prime=true;
	       if(num1<=2) {
//	    	   System.out.println("is not a prime number");
	    	   prime=false;
	       }
	       for(int i=3;i<num1;i++) {
	    	 if(num1%2==0) {
	    		 prime=false;
	    		 break;
	    	 }
	       }
	       if(prime==true) {
	    	   System.out.println("Is a prime number");
	       }
	       else {
	    	   System.out.println("is not a prime number");
	       }
	}

}
