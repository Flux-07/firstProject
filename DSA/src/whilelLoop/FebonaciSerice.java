package whilelLoop;

import java.util.Scanner;

public class FebonaciSerice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the Febonacci number "); 
		   int number=sc.nextInt();
		   int a=1;
		   int b=1;
		   int count=3;
//		   if(number<0) {
//			   System.out.println("Please enter the valid input");
//		   }
//		   else if(number==1) {
//			   count=1;
//		   }
		   for(int i=2;i<=number;i++) {
			   int c=a+b;
			  if(number==c) {
				   break;
			  }else {
				  
				   a=b;
				   b=c;
				   count++;
			  }
			   
		   }
		   System.out.println(count);
	}

}
