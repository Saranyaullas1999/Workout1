import java.util.*;
public class SwapNum{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st num:");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd num:");
		int b = sc.nextInt();
		System.out.println("Before Swapping: value of a " +a+ " and value of b " +b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping: value of a " +a+ " and value of b " +b);
	}
}