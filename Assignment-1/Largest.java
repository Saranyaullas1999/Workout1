import java.util.*;
public class Largest{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number:");
		int b = sc.nextInt();
		System.out.println("Enter the 3rd number:");
		int c = sc.nextInt();
		int r = c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("The largest num is: " +r);
	}
}