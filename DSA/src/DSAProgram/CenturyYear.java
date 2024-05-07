package DSAProgram;
import java.util.Scanner;
public class CenturyYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the year");
         int year=sc.nextInt();
         if(year<0) {
        	 System.out.println("Negative number is not allow");
         }
         else if(year%100==0) {
        	 System.out.println(year/100+" century");
         }
         else {
        	 System.out.println((year/100)+1+" century");
         }
       
	}

}
