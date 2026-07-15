import java.util.*;
class Facnum
{
		public static void main(String s[])
		{
			int n;
			int fac=1;
			Scanner sr=new Scanner(System.in);
			n=sr.nextInt();
			for(int i=1;i<=n;i++)
			{	
				fac=fac*i;
			}
			System.out.println(fac);
		}
}