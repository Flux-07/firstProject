package classnotes;
import java.util.Scanner;
public class averageList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number of elements");
        int list=sc.nextInt();
        if(list<=0) {
        	System.out.println("No number entered cantnot calculate tha average");
        	return;
        }
        for(int i=1;i<=list;i++) {
        	System.out.println("Enter the value of "+i+" list");
        	sum=sum+sc.nextInt();
        }
       double average=(double) sum/list;
       System.out.println("The average is: "+average);
        
	}

}
