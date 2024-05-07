package whilelLoop;

import java.util.Scanner;

public class FibbonacciNumberChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the Febonacci number "); 
		   int number=sc.nextInt();
           int a=1;
           
           int b=1;
           
          while(true) {
        	  int c=a+b;
        	 if(number==c || number==1) {
        		 System.out.println(number+" is a Febonacci number");
        		 break;
        	 }
        	 else if(number>b && number<c) {
        		 System.out.println(number+" is not aFebonacci number");
        		 break;
        	 }
        	 else {
        		 a=b;
        		 b=c;
        		 
        	 }
          }
	}

}
