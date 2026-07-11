import java.util.Scanner;

class ComputeAreaWithConstant
{
	public static void main(String[] args)
	{
		Scanner sr=new Scanner(System.in);
		double radius = sr.nextDouble();
		double area;
		final double pi=3.14159;
		
		area = radius * radius * pi;
		System.out.println("area for the circle of radius "+radius+" is "+area);
	}
}