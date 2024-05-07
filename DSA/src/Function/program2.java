package Function;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] static GCD(int a,int b) {
		int[] ar=new int[2];
		int ref=a;
		int ref2=b;
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=b;
		}
		ar[0]=a;
		
		int lcm=(ref*ref2)/ar[0];
		return ar[a,lcm];
		
	}

}
