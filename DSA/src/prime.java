import java.util.*;

public class prime {

	public static boolean prime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);num++) {
			if(num%i==0) {
				return false;
			}
			return true;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
    int number=sc.nextInt();
     boolean isPrime=prime(number);
     if(isPrime) {
    	 System.out.println(number+" is a prime number");
     }else {
    	 System.out.println(number+" is not  a prime number");
     }
	}

}
