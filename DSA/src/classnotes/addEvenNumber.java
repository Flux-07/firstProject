package classnotes;

import java.util.Scanner;

public class addEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the  number 1"); 
		   int number=sc.nextInt();
		   System.out.println("Enter the  number 2"); 
		   int number2=sc.nextInt();
		   if(number%2!=0) {
			   number=number+1;
		   }
		   int sum=0;
		   while(number<=number2) {
			  
			   sum=sum+number;
			   number=number+2;
		   }
		   System.out.println("sum of even number "+number+" and "+number+" : "+sum);
		   
	}

}
