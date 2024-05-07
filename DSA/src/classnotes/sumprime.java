package classnotes;

import java.util.Scanner;

public class sumprime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the  number 1"); 
		   int number=sc.nextInt();
		   System.out.println("Enter the  number 2"); 
		   int number2=sc.nextInt();
		   int i=2;
		   int p=0;
		   int c=0;
		   while(i<=number2) {
			  boolean prime=true;
			  int j=2;
			  while(j<=i/2) {
				  if(i%j==0) {
					  prime=false;
				  }
				  j++;
			  }
			  if(prime) {
				  p=p+i;
			  }
			  else {
				  c=c+i;
			  }
			  i++;
		   }
		   System.out.println(p+" "+c);
	
		   
	}

}
