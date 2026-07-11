class ShowCurrentTime
{
	public static void main(String[] agrs)
	{
		long tmillisec=System.currentTimeMillis();
		long tsec=tmillisec/1000;
		long cusec=tsec%60;
		long tmin=tsec/60;
		long cumin=tmin%60;
		long thours=tmin/60;
		long cuhours=thours%24;
		
		System.out.println(cuhours+":"+cumin+":"+cusec);
	}
}