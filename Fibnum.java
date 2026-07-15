import java.util.*;
class Fibnum
{
		public static void main(String s[])
		{
			int a=0,b=1,fib=0,n;
			Scanner sr=new Scanner (System.in);
			n=sr.nextInt();
			for(int i=0;i<n-2;i++)
			{
				fib=a+b;
				a=b;
				b=fib;
			}
			System.out.println(fib);
		}
}