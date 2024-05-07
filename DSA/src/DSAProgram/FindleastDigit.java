package DSAProgram;
import java.util.Scanner;

public class FindleastDigit {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number ");	
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd number ");	
        int num2=sc.nextInt();
        System.out.println("Enter the 3rd number ");	
        int num3=sc.nextInt();
        System.out.println("Enter the 4th number ");	
        int num4=sc.nextInt();
        int max=num4;
        int i=1;
       
        	if((max%num1==0&&max%num2==0)&&( max%num3==0&&max%num4==0)) {
        		System.out.println(max);
        		break;
        		
        	}
        	else {
        		i=i+1;
        		max=max*i;
        	}
        	
        }
	}
	
}
