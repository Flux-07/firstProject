package DSAProgram;

import java.util.Scanner;

public class CommisionBasedOnAmout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the Amout");
		 
		  int amount=sc.nextInt();
		  double commission=0;
		  int rate=0;
		  if(amount<=10000) {
			  rate=0;
			  commission=0;
		  }
		  else  if(amount>10000 && amount<=20000) {
			  rate=3;
			  commission=amount*0.3;
		  }
		  else if(amount>20000 && amount<=50000) {
			  rate=5;
			  commission=amount*0.5;
		  }
		  else {
			  rate=10;
			  commission=amount*0.1;
		  }
		  
		  System.out.println("The commisiion is "+commission+" rate is "+rate);
		  
	}

}
