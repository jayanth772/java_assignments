package Assignment1;
import java.util.*;

public class Task1 {
	
	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a value");
		int a=s.nextInt();
		
		System.out.println("Enter b value");
		int b=s.nextInt();
		
		int c=a;
		a=b;
		b=c;
		
		System.out.println("After swapping a value is "+a+" b value is "+b);
	}

}
