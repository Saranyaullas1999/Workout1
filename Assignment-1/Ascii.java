import java.util.*;
public class Ascii
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ënter the character : ");
		char c = sc.next().charAt(0);
		int a = c;
		System.out.println("The Character is " +c+ " and ASCII value is "+a);
	}
}