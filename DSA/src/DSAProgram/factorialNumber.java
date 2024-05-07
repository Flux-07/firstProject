package DSAProgram;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number");
		  int number=sc.nextInt();
		  int factorial=1;
		  for(int i=1;i<=number;i++) {
			  factorial=factorial*i;
		  }
		  System.out.println(number + " factorial is "+ factorial);
	}

}
