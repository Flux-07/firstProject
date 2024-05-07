package classnotes;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the  number 1"); 
		   int num1=sc.nextInt();
		   System.out.println("Enter the  number 2"); 
		   int num2=sc.nextInt();
		   
		   int countEven=0;
		   int countOdd=0;
		   
		   while(num1<=num2) {
			   if(num1%2==0) {
				   countEven++;
			   }
			   else {
				   countOdd++;
			   }
			   num1++;
		   }
		   
		   System.out.println("Number of even  number between "+num1+" and "+num2+" "+ countEven);
		   System.out.println("Number of even  number between "+num1+" and "+num2+" "+countOdd);
	}

}
