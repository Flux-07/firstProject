package SwitchStatement;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the number between 1 and 12 "); 
		   int monthNumber=sc.nextInt();
		   String montName=" ";
		   switch(monthNumber) {
		   case 1:
//			   System.out.println("The month name is Jan");
			   montName="January";
			   break;
		   case 2:
			   montName="February";
//			   System.out.println("The month name is Feb");
			   break;
			   
		   case 3:
			   montName="March";
//			   System.out.println("The month name is March");
			   break;
			  
		   case 4:
			   montName="April";
//			   System.out.println("The month name is April");
			   break;
		   case 5:
			   montName="May";
//			   System.out.println("The month name is May");
			   break;
			   
		   case 6:
			   montName="June";
//			   System.out.println("The month name is Jun");
			   break; 
		     
		   case 7:
			   montName="July";
//			   System.out.println("The month name is July");
			   break; 
			   
		   case 8:
			   montName="August";
//			   System.out.println("The month name is Aug");
			   break; 
		   case 9:
			   montName="September";
//			   System.out.println("The month name is Sep");
			   break; 
		   case 10:
			   montName="October";
//			   System.out.println("The month name is Oct");
			   break; 
		     
		   case 11:
			   montName="November";
//			   System.out.println("The month name is Nov");
			   break; 
		   case 12:
			   montName="December";
//			   System.out.println("The month name is Dec");
			   break; 
			 
		   }
	     
	   if(montName!=" ") {
		   System.out.println("The month name is "+montName);   
	   }else {
		   System.out.println("The number is invalid");
	   }
	   
	}

}
