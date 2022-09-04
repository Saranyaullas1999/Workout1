import java.util.*;
public class Armstrong{
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("The first interval is :");
		a = sc.nextInt();
		System.out.println("The second interval is :");
		b = sc.nextInt();
		for(int i=a;i<b;i++)
		{
		int x,rem,sum=0;
		x=i;
		while(x!=0)
		{
		rem=x % 10;
		sum=sum+(rem * rem * rem);
		x=x/10;
		}
		if(sum==i)
		{
		System.out.println("" +i+ " is an armstrong number");
		}
		}
		
	}
}