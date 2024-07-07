package Assignment1;

public class Task6 {
	
	public static void main(String args[]) {
		
		System.out.println("Prime numbers in the range of 1 to 1000");
		for(int i=1;i<1000;i++) {
			int dec=0;
			  if(i==1)
			  {
				  dec=1;
			  }
			  else {
//				  int counter=0;
				  for(int j=2;j<i;j++)
				  {
					  if(i%j==0)
					  {
						  dec=1;
						  break;
					  }
				  }
				  
			  }
			  if(dec==0)
			  {
				  System.out.print(i+",");
			  }
			
		}
	}

}
