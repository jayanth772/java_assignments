package Assignment1;

public class Task9 {
	
	public static void main(String args[])
	{
		
		int []values= {12,34,66,85,900};
		for(int i:values) {
			
			if(i==85) {
				System.out.println("Breaking the loop as we got 85");
				break;
			}
			else {
				System.out.println(i);
			}
		}
		
	}

}
