package whilelLoop;
import java.util.Scanner;
public class gcd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int min=a;
        if(b<a) {
        	min=b;
        }
       int res=0;
        for(int i=1;i<=min;i++) {
        	if(a%i==0&&b%i==0) {
        		res=i;
        	}
        }
	}

}
