class Calculater
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
		if(s.length==3)
		{
			a=Integer.parseInt(s[0]);
			b=Integer.parseInt(s[1]);
			String op=s[2];
			if(op.equals("+"))
			{
				sum=a+b;
			}
			else if(op.equals("-"))
				sum=a-b;
			else if(op.equals("x"))
				sum=a*b;
			else if(op.equals("/"))
				sum=a/b;
			else
				sum=0;
		}
		else
		{
			System.out.println("Enter 3 command value.🥱");
		}
		System.out.println("Ans. is :"+sum);
	}
}