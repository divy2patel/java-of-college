import java.util.*;
class Increment
{
    public static void main()
    {
        Increment i=new Increment();
        int x;
        Scanner sr=new Scanner(System.in);
        x=sr.nextInt();

        System.out.println("x before increment:"+x);
        x=i.incremant(x);
        System.out.println("x after increment:"+x);
    }
    int incremant(int x)
    {
        x=x+1;
        return x;
    }
}