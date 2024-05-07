package SwitchStatement;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter C if you are reading celsius reading or F if you are reading a Ferenheit reading"); 
		   char ch=sc.next().charAt(0);
		   System.out.println("Enter the reading you want convert");
		   int temperature=sc.nextInt();
		   double tempConvert=0;
		   
		   switch(ch) {
		   case 'c':
		   case 'C':
			   // celsius to fehrenheit formul==>[((9/5)*number)+32]
			   tempConvert=(1.8*temperature)+32;
			   System.out.println("The  Fehreneheit reading of given temperature is : "+tempConvert);
			   break;
		   case 'f':
		   case 'F' :
			   tempConvert=1.8*(temperature-32);
			   System.out.println("The Celsius reading of given temperature is : "+tempConvert);
		   }
		   
		  
	
	}

}
