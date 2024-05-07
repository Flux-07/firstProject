package DSAProgram;

import java.util.Scanner;

public class perfectSuare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter the checking perfect square number");
       
         int number=sc.nextInt();
         boolean result=false;
         int start=1;
         int end=number/2;
        
         if(number==1) {
        	 result=true;
         }
         
         while(start<=end) {
        	 int mid=(start+end)/2;
        	 int square=mid*mid;
        	 if(square==number) {
        		 result=true;
        		 break;
        		 
        	 }
        	 else if(number<square) {
                     end=mid-1;
        	 }
        	 else if(number>square) {
        		 start=mid+1;
        	 }
        	 
         }
         if(result==true) {
        	 System.out.println( number+" is Perfect Square number");
         }
         else {
        	 System.out.println( number+" is not Perfect Square number");
         }
	}

}
