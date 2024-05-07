package classnotes;

import java.util.Scanner;

public class sumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int sum=1;
        while(num>10) {
        	int rem=num%10;
        	sum=sum*rem;
        	num=num/10;
        }
        System.out.println(sum);
	}

}
