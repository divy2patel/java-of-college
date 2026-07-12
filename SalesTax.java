import java.util.Scanner;

class SalesTax
{
	public static void main(String[] agrs)
	{
		Scanner sr= new Scanner(System.in);
		double amount= sr.nextDouble();
		
		double tex=amount*0.06;
		System.out.println("sales tax is "+(int)(tex*100)/100.0);
	}
}