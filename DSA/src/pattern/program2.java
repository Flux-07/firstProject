package pattern;
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         int number=sc.nextInt();
         for(int row=1;row<=(2*number)-1;row++) {
        	 int totalColumn=(row>number?2*number-row:row);
//        	 if(row>number) {
//        		 totalColumn=2*number-row;
//        	 }
//        	 else {
//        		 totalColumn=row;
//        	 }
//        	 System.out.println(totalColumn);
        	 for(int col=1;col<=totalColumn;col++) {
        		 System.out.print("* ");
        	 }
        	 System.out.println();
         }
	}

}
