import java.util.Scanner;

class SumArray
{
	public static void main(String[] args)
	{
		int[] arr= new int [5];
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.print("sum="+sum);
	}
}