package classnotes;

import java.util.Scanner;

public class FindOccurrencesOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("Enter the Finding Number");
        int find=sc.nextInt();
        
        int reference=num;
        int count=0;
        while(num!=0) {
        	int rem=num%10;
         if(rem==find) {
        	 count++;
         }
        	num=num/10;
        }
        System.out.println(reference+" Total occurrence of "+find+" digit is :"+count);
	}

}
