package dowhile;

import java.util.Scanner;

public class serise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the number "); 
		   int number=sc.nextInt();
		int count=1;
		int sum=0;
		do {
			sum=sum+(count-(count+1));
			count=count+2;
		}while(count<=number);
		System.out.println(sum);   
	}

}
