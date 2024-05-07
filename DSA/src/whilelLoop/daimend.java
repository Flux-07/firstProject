package whilelLoop;

public class daimend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=4;
//        for(int i=1;i<=num;i++) {
//        int j=0;
//        for(j=1;j<=num-i;j++) {
//        	System.out.print(" ");
//        }
////        System.out.println();
//         for(int k=1;k<=num+i-j;k++) {
//        	 System.out.print("*");
//        	 
//         }
//         System.out.println();
//        }
        
        for(int i=num;i>=0;i--) {
        	for(int j=4;j>=num-i;j--) {
        		System.out.print("* ");
        	}
        }
	}

}
