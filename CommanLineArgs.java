class CommanLineArgs
{
	public static void main(String s[])
	{
		int a=0,b=0,sum=0;
		/*
		a=Integer.parseInt(s[0]);
		b=Integer.parseInt(s[1]); //java CommanLineArgs 5 10 in cmd not forgot or get error

		sum=a+b;
		
		System.out.println("Addition is :"+sum);
		*/
		if(s.length==2)
		{
			a=Integer.parseInt(s[0]);
			b=Integer.parseInt(s[1]);
		}
		else
		{
			System.out.println("Enter 2 command value.🥱");
		}
		sum=a+b;
		System.out.println("Addition is :"+sum);
	}
}