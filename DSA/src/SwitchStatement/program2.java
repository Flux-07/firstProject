package SwitchStatement;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the number of quatity"); 
		   int Quantity=sc.nextInt();
		   double price=100;
		   switch(Quantity) {
		   case 1:
			   System.out.println("The total cost is : "+price);
			   break;
			   
		   case 2:
			   price=price-(price/10);
			   System.out.println("the total Cost is :"+ price);
			   break;
			   
		   case 3:
			   price=price-(price/20);
			   System.out.println("the total Cost is :"+ price);
			   break;
		   case 4:
			   price=price-(price/30);
			   System.out.println("the total Cost is :"+ price);
			   break;
			   
			   default :
				   
				   price=price-(price/40);
				   System.out.println("the total Cost is :"+ price);
				   break;
		   }
		  
		System.out.println((price*0.1));
		   
	}

}
