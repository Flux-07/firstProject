package whilelLoop;

import java.util.Scanner;

public class febo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the Febonacci number "); 
		   int number=sc.nextInt();
		   int a=1;
		   int b=1;
		   System.out.println(a);
		   System.out.println(b);
		  
		for(int i=0;i<= number;i++) {
			 int c=a+b;
			   if(c>number) {
				  
				   break;
			   }
			  System.out.println(c);
			   a=b;
			   b=c;
		   }
	}

}
