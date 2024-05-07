package SwitchStatement;

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the Grade"); 
		  char grade=sc.next().charAt(0);
		 switch(grade) {
		 case'a':
		 case 'A' :
			 System.out.println("Your marks is 90-100 calculating based on your grade");
			 break;
		 case'b':
		 case 'B' :
			 System.out.println("Your marks is 80-89 calculating based on your grade");
			 break;
		 case'c':	 
		 case 'C' :
			 System.out.println("Your marks is 60-79 calculating based on your grade");
			 break;
			 
		 case 'D' :
			 System.out.println("Your marks is 45-59 calculating based on your grade");
			 break;
		 case 'F' :
			 System.out.println("Your marks is 0-45 calculating based on your grade");
			 break;
		 }
		 

	}

}
