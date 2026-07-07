public class Fib
{
	public static void main(String args[])
	{
		int n=10;
		int a=0,b=1,fib;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<n;i++)
		{
			fib=a+b;
			a=b;
			b=fib;
			System.out.print(fib+" ");
		}
	}
}