import java.util.Scanner;
class Addition
{
	public static void main(String s[])
	{
		int a,b,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A:");
		a=sc.nextInt();
		System.out.println("Enter B:");
		b=sc.nextInt();
		
		sum=a+b;
		
		System.out.println("Addition is :"+sum);
	}
}