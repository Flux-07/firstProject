package classnotes;

import java.util.Scanner;

public class SumOfSerice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     
        System.out.println("Enter the number");
        int num=sc.nextInt();
        double sum=0.0;
        double count=1;
        while(count<=num) {
        	sum=sum+(count/(count+1));
        	System.out.println((count/(count+1)));
        	count++;
        }
        System.out.println(sum);
	}

}
