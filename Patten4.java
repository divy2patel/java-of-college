public class Patten4
{
	public static void main(String args[])
	{
		int n=10;
		for(int i=0;i<n;i++)
		{
			if(i<n-i)
			{
				for(int j=0;j<n-2*i;j++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<i+1;k++)
				{
					System.out.print("* ");
				}
				System.out.println("");
			}
		}
		for(int i=0;i<n/2+1;i++)
		{
			for(int j=0;j<i;j++)
				{
					System.out.print("  ");
				}
			for(int k=0;k<n/2-i+1;k++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}