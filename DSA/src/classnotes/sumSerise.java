package classnotes;

import java.util.Scanner;

public class sumSerise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=num) {
        	sum=sum+(i-(i+1));
        	i=i+2;
        }
        System.out.println(sum);
	}

}