package pattern;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         int number=sc.nextInt();
         
         int star=1;
         int space=number-2;
                
        
        
         for( int i=1;i<=number;i++) {

        	 
        	 
        	 for(int j=1;j<=star;j++) {
        		System.out.print("*"); 
        	 }
        	 for(int k=1;k<=space;k++) {
        		 System.out.print(" ");
        	 }
        	 for(int j=1;j<=star;j++) {
         		System.out.print("*"); 
         	 }
        	 System.out.println();
//        	 System.out.println(space+" "+star);
        	 if(i<number/2) {
        		 star++;
        		 space=space-2;
        	 }
        	 else {
        		 star--;
        		 space=space+2;
        	 }
         }
         
       }
	

}
