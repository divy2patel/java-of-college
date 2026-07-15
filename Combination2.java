import java.util.*;
class Combination2
{
	public static void main(String s[])
	{
		int[] arr={1,2,3,4};
		
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				for(int k=0;k<4;k++)
					for(int l=0;l<4;l++)
					{
						if(arr[i]<arr[j]&&arr[k]>arr[l]&&i!=j&&i!=k&&i!=l&&j!=k&&j!=l&&k!=l)
						{
							System.out.print(arr[i]+""+arr[j]+""+arr[k]+""+arr[l]);
							System.out.println();
						}
					}
	}
}