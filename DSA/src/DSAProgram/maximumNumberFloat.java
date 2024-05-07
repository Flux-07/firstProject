//maximum number using float

package DSAProgram;

import java.util.Scanner;

public class maximumNumberFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the number one");
	      float num1=sc.nextFloat();
	       System.out.println("Enter the number two");
	       float num2=sc.nextFloat();
	       System.out.println("Enter the number three");
	       float num3=sc.nextFloat();
	       float max=num1;
	       if(num2>max) {
	    	   max=num2;
	       }
	       if(num3>max) {
	    	   max=num3;
	       }
	       System.out.println(max+" is the maximum Number ");
	       
	       
	}

}
