import java.util.*;
class Max
{
    public static void main(String s[])
    {
        Max m=new Max();
        int a,b,c;
        Scanner sr=new Scanner(System.in);
        a=sr.nextInt();
        b=sr.nextInt();
        c=sr.nextInt();
        int max=m.maxnum(a,b,c);
        System.out.println(max);
    }

    int maxnum(int x,int y,int z)
    {
        if(x>y&&x>z)
        {
            return x;
        }
        else if(y>x&&y>z)
        {
            return y;
        }
        else
            return z;
    }

}