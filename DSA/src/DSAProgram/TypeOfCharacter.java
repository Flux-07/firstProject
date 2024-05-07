package DSAProgram;

import java.util.Scanner;

public class TypeOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the character");
	       char c=sc.next().charAt(0);
	       if(c>='a' && c<='z') {
	    	   System.out.println(c+" is lowerCase character ");
	       }
	       else if(c>='A' && c<='Z') {
	    	   System.out.println(c+" is "
	    	   		+ "uperCase character ");
	       }
	       else {
	    	   System.out.println(c+" is special  character ");
	       }
	}

}
