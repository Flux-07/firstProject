package DSAProgram;
import java.util.Scanner;
//even or odd using multiplication and division

public class Even{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number");
  int number=sc.nextInt();
  if((number/2)*2==number){
      System.out.println("The given number is Even ");
   }
 else{
     System.out.println("The given number is Odd");
}
}

}
