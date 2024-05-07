package Function;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program1 obj=new program1();
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
	    int display=	obj.fectorial(number, 1);
	    System.out.println(display);
        
	}
	
	public int fectorial(int number,int result) {
		for(int i=1;i<=number;i++) {
			result=result*i;
		}
		return result;
	}

}
