package pattern;

import java.util.Scanner;

public class program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	         System.out.println("Enter the number");
	         int number=sc.nextInt();
	         
	       
	         for(int i=1;i<=number;i++) {
	        	 boolean check=true;
	        	if(i%2!=0) {
	        		 check=true;
	        	}else {
	        		check=false;
	        	}
	        	 for(int j=1;j<=i;j++) {
	        		 if(check) {
	        		 System.out.print("1"+" ");
	        		 check=false;
	        		 }else {
	        			 System.out.print("0"+" ");
	        			 check=true;
	        		 }
	        	 }
	        	 System.out.println();
	         }
	}

}
