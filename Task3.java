package Assignment1;

public class Task3 {
	
	public static void main(String args[]) {
		
       Object[] a = {10, 90.78, 111, 8989, 7876};
		
		float sum = 0,avg=0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof Integer) {
				sum += (Integer) a[i];
			} else if (a[i] instanceof Double) {
				sum += (Double) a[i];
			}
		}
		
		avg=sum/a.length;
		
		System.out.println("The average of the list is "+avg);
		
		System.out.printf("The average of the list upto 2 decimal points %.2f%n",avg);
	}

}
