package dowhile;

import java.util.Scanner;

public class numberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the number "); 
		   int number=sc.nextInt();
		   int count=1;
		   int totalDigit=0;
		   do {
			   number=number/10;
			   totalDigit++;
			   count++;
		   }while(number!=0);
		   System.out.println(totalDigit);
	}

}
