package whilelLoop;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the  number"); 
		   int number=sc.nextInt();
		   int i=1;
		   while(i<=number) {
			   int j=1;
			   while(j<=i) {
				   System.out.print("* ");
				   j++;
			   }
			   System.out.println();
			   i++;
		   }
	}

}
