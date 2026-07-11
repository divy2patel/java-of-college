import java.util.Scanner;

class DisplayTime
{
	public static void main(String[] args)
	{
		Scanner sr=new Scanner(System.in);
		int sec=sr.nextInt();
		int min=sec/60;
		int remsec=sec%60;
		
		System.out.println(sec+" second is "+ min +" minutes and "+ remsec +" secound");
		
	}
}