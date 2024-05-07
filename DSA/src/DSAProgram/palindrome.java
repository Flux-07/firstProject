package DSAProgram;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the name");
	       String word=sc.nextLine();
	       String palindrome="";
	       for(int i=word.length()-1;i>=0;i--) {
	    	   palindrome=palindrome+word.charAt(i);
	       }
	       System.out.println(palindrome);
	     System.out.println(word==palindrome);
	       if(word==palindrome) {
	    	   System.out.println("The given word is palindrome");
	       }
	       else {
	    	   System.out.println("The given word is not a palindrome");
	       }
	     
	       
	}

}
