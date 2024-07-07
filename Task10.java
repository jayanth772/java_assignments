package Assignment1;

public class Task10 {
	
	public static void main(String args[]) {
		
		String []values= {"Java","JavaScript","Selenium","Python","Mukesh"};
				
		for(String i:values) {
			
			if(i=="Selenium") {
				
				System.out.println("breaking the loop as we found Selenium");
				break;
			}
			else
			{
				System.out.println(i);
			}
		}
		
		
	}

}
