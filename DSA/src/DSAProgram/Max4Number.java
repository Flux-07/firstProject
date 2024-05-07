
package DSAProgram;

import java.util.Scanner;

public class Max4Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the number one");
	      int num1=sc.nextInt();
	       System.out.println("Enter the number two");
	       int num2=sc.nextInt();
	       System.out.println("Enter the number three");
	       int num3=sc.nextInt();
	       System.out.println("Enter the number four");
	       int num4=sc.nextInt();
	       int max=num1;
	       if(num2>max) {
	    	   max=num2;
	       }
	        if(num3>max) {
	    	   max=num3;
	       }
	        if(num4>max) {
	        	max=num4;
	        }
	       System.out.println(max+" is the maximum Number ");
	       
	       
	}

}