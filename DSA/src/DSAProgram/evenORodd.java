package DSAProgram;
import java.util.Scanner;
public class evenORodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     int number=sc.nextInt();
     if((number & 1)==0 && number!=0) {
    	 System.out.println("Given number is Even");
     }
     else if(number==0) {
    	 System.out.println("The number is neither Even nor Odd");
     }
     else {
    	 System.out.println("The given number is Odd");
     }
	}

}
