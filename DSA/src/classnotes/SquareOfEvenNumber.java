package classnotes;
import java.util.Scanner;
public class SquareOfEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the  number"); 
		   int number=sc.nextInt();
		   int SquareNumber=2;
		    while(SquareNumber<=Math.sqrt(number)) {
		    	System.out.println(SquareNumber*SquareNumber);
		    	SquareNumber=SquareNumber+2;
		    }
	}

}
