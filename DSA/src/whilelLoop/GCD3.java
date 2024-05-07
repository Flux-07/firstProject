package whilelLoop;

import java.util.Scanner;

public class GCD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        while(b!=0 ) {
        	int temp=b;
        	b=a%b;
        	a=temp;
        	if(b==0) {
        		while(c!=0) {
        			temp=c;
            		c=a%c;
            		a=temp;
        		}
        	}
        }
        System.out.println(a);
	}

}
