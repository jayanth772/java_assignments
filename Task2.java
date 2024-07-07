package Assignment1;

public class Task2 {
	
	public static void main(String args[])
	{
		
        Object[] a = {10, 90.78, 111, 8989, 7876};
		
		double sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof Integer) {
				sum += (Integer) a[i];
			} else if (a[i] instanceof Double) {
				sum += (Double) a[i];
			}
		}		
		System.out.println("Sum of the list of values is "+sum);
		
	}

}
