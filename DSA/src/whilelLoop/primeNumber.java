package whilelLoop;
import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     
      int count=0;
    for(int num=2;num<=100;num++) {
    	boolean prime=true;
    
    	for(int j=2;j<=num/2;j++) {
    	  if(num%j==0) {
    		  prime=false;
    		 
    	  }
    	}
    	if(prime) {
    	count++;
    	}
     }
    System.out.println(count);
     
	}

}
