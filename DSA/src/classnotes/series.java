package classnotes;

import java.util.Scanner;

public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     
        System.out.println("Enter the number");
        int num=sc.nextInt();
         double sum=0.0;
         
//        for(double i=1;i<=num;i++) {
//        	sum=sum+1/i;
//        }
         double i=1;
         while(i<=num) {
        	 sum=sum+1/i;
        	 i++;
         }
        System.out.println("the sum of 1+1/2++1/3...+1/n : "+sum);
	}

}
