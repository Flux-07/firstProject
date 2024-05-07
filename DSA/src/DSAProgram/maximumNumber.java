//Maximum number of three number

package DSAProgram;
import java.util.Scanner;

public class maximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number one");
       int num1=sc.nextInt();
       System.out.println("Enter the number two");
       int num2=sc.nextInt();
       int sum=num1+num2;
       int a=sum-num1;
       int min=0;
       if(a>min) {
    	   min=a;
       }
       int b=sum-num2;
       if(b<min) {
    	   min=b;
       }
       if(sum-num1==min) {
    	   System.out.println("number one is maximum");
       }
       if(sum-num2==min) {
    	   System.out.println("number two is maximum");
       }
	}

}
