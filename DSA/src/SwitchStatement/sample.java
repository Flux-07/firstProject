package SwitchStatement;

import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
         System.out.println("Enter the number product ");
         int product=sc.nextInt();
         String[] Username=new String[product];
         String[] FoodName=new String[product];
         int[] FoodRate=new int[product];
         int[] FoodQuantity=new int[product];
         int[] TotalAmount=new int[product];
          
         boolean res=true;
         while(res) {
        	 
        	 System.out.println("Order the Food Enter 1 ");
        	 System.out.println("Pay the Food Amount Enter 2 ");
        	 System.out.println("Enter 3 exit the loop");
        	 int choice=sc.nextInt();
        	  switch(choice) {
        	  case 1:
        		  
        		  int i=0;
        	         while(i<=product-1) {
        	        	  System.out.println("Enter the name of user");
        	        	  Username[i]=sc1.nextLine();
        	        	  System.out.println("Enter the name of Food");
        	        	  FoodName[i]=sc1.nextLine();
        	        	  System.out.println("Enter the Amount of Food");
        	        	  FoodRate[i]=sc.nextInt();
        	        	  System.out.println("Enter the Quantity of Food");
        	        	  FoodQuantity[i]=sc.nextInt();;
        	        	  TotalAmount[i]=FoodRate[i]*FoodQuantity[i];  
        	        	  i++;
        	        	  
        	         }
        	         break;
        	  case 2:
        		  System.out.println("Enter the name");
        		  String name=sc1.nextLine();
        		  for(int i1=0;i1<Username.length;i1++) {
        			  if(Username[i1].contains(name)) {
        				  System.out.println("Your amont is :"+TotalAmount[i1]);
        			  }
        		  }
        		  break;
        	  case 3:
        		  System.out.println("exit is successfully");
        		  res=false;
              }
         }
       
      
         
//         System.out.println(Username[0]+" "+TotalAmount[0]);
	}
	
}
