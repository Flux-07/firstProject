package classnotes;
import java.util.*;
public class randomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i=1;
      Random ran=new Random();
       while(i<=100) {
    	   System.out.println(ran.nextInt(100));
    	   i++;
       }
	}

}
