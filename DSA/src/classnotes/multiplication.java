//multiplication

package classnotes;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the  number "); 
		   int number=sc.nextInt();
		   int multiplier=1;
		   while(multiplier<=10) {
			   System.out.println(number+" * "+multiplier+" = "+number*multiplier);
			   multiplier++;
		   }
	}

}
