package DSAProgram;

import java.util.Scanner;

public class yearBasedOnCentury {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Century");
         int century=sc.nextInt();
         if(century<0) {
        	 System.out.println("The negative number is not aloow"); 
         }
         else if(century==0) {
        	 System.out.println("O year");
         }
         else if(century>0) {
        	 System.out.println("The year betwwen "+((century*100)-99)+" To "+((century*100)));
         }
	}

}
