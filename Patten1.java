public class Patten1
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			if(i<n-i)
			{
				for(int j=0;j<n-i-1;j++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<i+1;k++)
				{
					System.out.print("* ");
				}
				System.out.println("");
			}
			else
			{
				for(int j=0;j<i;j++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<n-i;k++)
				{
					System.out.print("* ");
				}
				System.out.println("");
			}
		}
	}
}