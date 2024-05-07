package whilelLoop;
import java.util.Scanner;

public class GCDofTwoNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        while(a!=0 && b!=0) {
        	if(a>b) {
        		a=a%b;
        	}
        	else {
        		b=b%a;
        	}
        	
        }
        if(a!=0) {
        	System.out.println(a);
        }
        else {
        	System.out.println(b);
        }
	}

}
