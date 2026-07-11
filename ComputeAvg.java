import java.util.Scanner;

class ComputeAvg{
	public static void main(String[] args)
	{
		Scanner sr= new Scanner (System.in);
		int a=sr.nextInt();
		int b=sr.nextInt();
		int c=sr.nextInt();
		float avg;
		
		avg=(a+b+c)/3;
		
		System.out.print("average="+avg);
	}
}