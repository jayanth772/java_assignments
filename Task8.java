package Assignment1;

public class Task8 {
	
	public static void main(String args[]) {
		
		int []marks= {78,12,89,55,35};
		
		System.out.println("Marks above 80 are:");
		
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]>80) {
				System.out.print(marks[i]+" ");
			}
		}
	}

}
