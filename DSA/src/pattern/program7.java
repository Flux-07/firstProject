package pattern;

import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        for(int row=number;row>=1;row--) {
          for(int space=1;space<=number-row;space++) {
        	  System.out.print(" ");
          }
          for(int i=1;i<=row;i++) {
        	  System.out.print("*"+" ");
          }
          System.out.println();
        }
        for(int row=2;row<=number;row++) {
            for(int space=1;space<=number-row;space++) {
          	  System.out.print(" ");
            }
            for(int i=1;i<=row;i++) {
          	  System.out.print("*"+" ");
            }
            System.out.println();
          }
	}

}
