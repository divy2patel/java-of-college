import java.util.*;

class Swapbycallreferance
{
    int l, b, h;   // fields, not constructor-local variables

    public static void main(String s[])
    {
        Swapbycallreferance o1 = new Swapbycallreferance();
        Swapbycallreferance o2 = new Swapbycallreferance();

        Scanner sr = new Scanner(System.in);
        o1.l = sr.nextInt();
        o1.b = sr.nextInt();
        o1.h = sr.nextInt();
        o2.l = sr.nextInt();
        o2.b = sr.nextInt();
        o2.h = sr.nextInt();

        Swapbycallreferance temp = new Swapbycallreferance();
        temp.swap(o1, o2);   // call on an instance
    }

    void swap(Swapbycallreferance o1, Swapbycallreferance o2)
    {
        int t;
        t = o1.l; o1.l = o2.l; o2.l = t;
        t = o1.b; o1.b = o2.b; o2.b = t;
        t = o1.h; o1.h = o2.h; o2.h = t;

        System.out.println("o1:" + o1.l + " ," + o1.b + " ," + o1.h);
        System.out.println("o2:" + o2.l + " ," + o2.b + " ," + o2.h);
    }
}