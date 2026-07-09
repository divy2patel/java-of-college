class CommanLineArgs
{
	public static void main(String s[])
	{
		int a,b,sum=0;
		a=Integer.parseInt(s[0]);
		b=Integer.parseInt(s[1]); //java CommanLineArgs 5 10 in cmd not forgot or get error
		
		sum=a+b;
		
		System.out.println("Addition is :"+sum);
	}
}