package DSAProgram;

import java.util.Scanner;

public class gradeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the number of subject");
	       int subjects=sc.nextInt();
	       float marks=0f;
	       int total=subjects*100;
	       char grade='\n';
	       float gradePoint=0;
	       for(int i=1;i<=subjects;i++) {
	    	   System.out.println("Enter the subject "+i+" marks");
	    	   int input=sc.nextInt();
	    	   if(input<100) {
	    		   marks =marks+input;
	    	   }
	    	   else {
	    		   System.out.println("your entered marks is Grether than 100 please enter less than 100");
	    		   break;
	    	   }
	       }
	       float percentage=(marks/total)*100;
	       if(percentage>=80 ) {
	    	   gradePoint=percentage/10;
	    	   grade='A';
	       } 
	       else  if(percentage<80 && percentage>=60) {
	    	   gradePoint=percentage/10;
	    	   grade='B';
	       } 
	       else  if(percentage<60 && percentage>=45) {
	    	   gradePoint=percentage/10;
	    	   grade='C';
	       } 
	       else  if(percentage<45) {
	    	   gradePoint=percentage/10;
	    	   grade='F';
	       } 
	       
	       System.out.println("The total Grade is "+grade+" you earned Grade Point "+gradePoint);
	       System.out.println("your percenatage is "+percentage);
	     
	}

}
 