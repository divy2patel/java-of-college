import java.util.*;
class GreatestCommanDivisorMethod
{
    public static void main(String s[])
    {
        GreatestCommanDivisorMethod g=new GreatestCommanDivisorMethod();
        int n1,n2;
        Scanner sr=new Scanner(System.in);
        n1=sr.nextInt();
        n2=sr.nextInt();
        int gcd=g.greatestcommandivisor(n1,n2);
        System.out.println(gcd);
    }
    int greatestcommandivisor(int x,int y)
    {
        int gc=1;
        for(int k=2;k<x&&k<y;k++)
        {
            if(x%k==0 && y%k==0)
            {
                gc=k;
            }
        }
        return gc;
    }
}