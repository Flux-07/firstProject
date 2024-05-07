package DSAProgram;

import java.util.Scanner;

public class trianglebasedAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the Degree of first Angle");
	       int angle1=sc.nextInt();
	       System.out.println("Enter the Degree of  Second Angle");
	       int angle2=sc.nextInt();
	       System.out.println("Enter the Degree of Thrid Angle");
	       int angle3=sc.nextInt();
	       int sum=angle1+angle2+angle3;
	       if(sum==180) {
	    	   if(angle1==90 || angle2==90 || angle3==90) {
	    		   System.out.println("This is a Right angle triangle");
	    	   }
	    	   else if(angle1>90 || angle2>90 || angle3>90) {
	    		   System.out.println("This is a Obtuse angle Triangle");
	    		   
	    	   }
	    	   else {
	    		   System.out.println("This is a Acute angle triangle"); //all angle must be less than 90 degree
	    	   }
	       }
	       else {
	    	   System.out.println("The given input is not valid");
	       }
	}

}
