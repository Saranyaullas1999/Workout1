import java.util.*;
public class Swap{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number:");
		int b = sc.nextInt();
		System.out.println("Before swapping: value of a " +a+ " and value of b " +b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping: value of a "+a+ " and value of b " +b);

	}
}