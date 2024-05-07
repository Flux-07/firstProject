package DSAProgram;

import java.util.Scanner;

public class DigitOrAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Character");
		 char character=sc.next().charAt(0);
		 int num=character;
		 for(int i=48;i<=57;i++) {
			 if(num>=10) {
				
				 break;
			 }
			 else if(character==i) {
				 System.out.println("the given character is digit");
				 break;
			 }
//			
		 }
		 for(int i=65;i<=90;i++) {
			 if(character==i) {
				 System.out.println("The given character is Alphabet");
				 break;
			 }
		 }
		 for(int i=90;i<=122;i++) {
			 if(character==i) {
				 System.out.println("The given character is Alphabet");
				 break;
			 }
		 }
	}

}
