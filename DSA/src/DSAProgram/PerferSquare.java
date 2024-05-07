package DSAProgram;

import java.util.Scanner;

public class PerferSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         int number=sc.nextInt();
         for(int i=2;i<=number/2;i++) {
        	 if(i*i==number) {
        		 System.out.println("The given number is Perfect Square");
        		 break;
        	 }
        	 else {
        		 System.out.println("The given number is not Perfect Square");
        		break;
        	 }
         }
	}

}
