package classnotes;
import java.util.Scanner;
import java.util.*;
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Welcome to MyApp");
     Scanner sc=new Scanner(System.in);
     Scanner sc1=new Scanner(System.in);
//     System.out.println("Enter the number of user");
//     int number=sc.nextInt();
     int number=0;
     ArrayList<String> UserName=new ArrayList<>();
     ArrayList<String> Password=new  ArrayList<String>();
     
     boolean openApp=true;
     number=number-1;
     while(openApp) {
    	 System.out.println("_________________________________________________________________________");
    	 System.out.println("1 Create your Acount");
    	 System.out.println("2 login MyApp Aplication");
    	 System.out.println("3 Exit the MyApp");
    	 
    	 int choice=sc.nextInt();
    	 switch(choice) {
    	 case 1:
    		
    		
    		 System.out.println("Enter your name");
    		 UserName.add(sc1.nextLine());
    		 System.out.println();
    		 System.out.println("Enter the Password");
    		 Password.add(sc1.nextLine());
    		 System.out.println();
    		 System.out.println(" your account created succussfully");
    		 System.out.println();
    		 
    		 break;
    	 case 2:
    		 System.out.println("Enter your name");
    		 String name=sc1.nextLine();
    		 for(int count =0;count<UserName.size();count++) {
    			 if(UserName.get(count)==name) {
    				 System.out.println("Login is Successfully");
    				 System.out.println("Next feature update soon");
    			 }
    			 else {
    				 System.out.println("username is invalid please create account ");
    			 }
    		 }
    		 
    	 case 3:
    		 System.out.println("Thanks for Visiting MyApp");
    		 openApp=false;
    		 break;
    	 }
     }
     System.out.println(UserName.size());
    
	}
	

}
