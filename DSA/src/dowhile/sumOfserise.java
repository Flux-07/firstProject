package dowhile;
import java.util.*;

public class sumOfserise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
//      double count=1;
//      double sum=0.0;
//      do {
//    	  sum=sum+(1/count);
//    	  count++;
//      }while(count<=number);
//      System.out.println(sum);
		int i=0;
		int sum=0;
		int sign=1;
		do {
			sum+=sign*i;
			sign=-sign;
		    i++;	
		}while(i<=n);
		System.out.println(sum);
		
	}

}
