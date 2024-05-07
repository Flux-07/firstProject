package DSAProgram;

import java.util.Scanner;

public class RootsOfQuadraticEuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Quadratic euation look Like : a(x)*2 + bx + c");
		 System.out.println();
		 System.out.println(" ___________________________________________________________");
		 
		 System.out.println("Enter the value of A");
		  double a=sc.nextDouble();
		  
		  if(a==0) {
			   System.out.println("A value does not zero please check it and give valid input");
		   }
		 
		  System.out.println("Enter the value of B");
		   double b=sc.nextDouble();
		 
		   System.out.println("Enter the value of C");
		   double c=sc.nextDouble();
		   
		   double discriminate=b*b-4*a*c;
		   
		  if(discriminate==0) {
			  System.out.println(" roots are real and equal");
			    double root1= -b/(2*a);
			    double root2= -b/(2*a);
			    System.out.println("Root one value is "+root1);
			    System.out.println("Root two value is "+root2);
			    
		  }
		  else if(discriminate>0) {
			  System.out.println("root are real and different");
			  double root1=(-b+Math.sqrt(discriminate))/2*a;
			  double root2=(-b-Math.sqrt(discriminate))/2*a;
			  System.out.println("Root one value is "+root1);
			   System.out.println("Root two value is "+root2);
		  }
		   
		  else if(discriminate<0) {
			  System.out.println("roots are imaginary");
			  double x=(-b/(2*a));
			  double y=Math.sqrt(-discriminate)/2*a;
			  System.out.println("Root one value is "+x+"+"+y+"i");
			   System.out.println("Root two value is "+ x+"-"+y+"i");
			  
		  }
		
	}

}
