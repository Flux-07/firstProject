package dowhile;

import java.util.Scanner;

public class multiolication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the number "); 
		   int number=sc.nextInt();
		   int count=1;
		   do {
			   int res=number*count;
			   System.out.println(number+"*"+count+" = "+res);
			   count++;
			   
		   }while(count<=10);
   
	}

}
