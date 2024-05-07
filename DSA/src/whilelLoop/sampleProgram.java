package whilelLoop;

public class sampleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 int number=100;
		 
		
		 for(int number=1;number<=9999;number++) {
			 int sum=0;
			 int ref2=number;
			 int ref=ref2;
			 int count=0;
		 while(ref2!=0) {
			 ref2=ref2/10;
			count++;
			
			
		 }
	
		if(ref2==0) {
			
			while(ref!=0) {
				int rem=ref%10;
				ref=ref/10;
				int ans=1;
				for(int i=1;i<=count;i++) {
					ans=ans*rem;
				}
				sum=sum+ans;
				
				
			}
			
			}
		if(sum==number) {
			System.out.println(sum);
		}
		}
		 
	}
	
	


	}
	