import java.util.Scanner;

class ComputeArea
{
	public static void main(String[] args)
	{
		Scanner sr=new Scanner(System.in);
		double radius = sr.nextDouble();
		double area;
		
		area = radius * radius * 3.14159;
		System.out.println("area for the circle of radius "+radius+" is "+area);
	}
}