package whilelLoop;

import java.util.Scanner;

public class gcd {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(b!=0) {
        	int temp=b;
        	b=a%b;
        	a=temp;
        }
        System.out.println("GCD of two number is "+a);
	}

}
