package DSAProgram;

import java.util.Scanner;

public class vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the name");
		   String name=sc.nextLine();
	       System.out.println("Enter the age");
	       int age=sc.nextInt();
	      
	       if(age<18) {
	    	   System.out.println(name+" is not eligible for voting 2023 because your age less than 18");
	       }
	       else {
	    	   System.out.println(name+" is eligible for voting ");
	       }
	}

}
