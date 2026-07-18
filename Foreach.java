import java.util.*;
class Foreach
{
    public static void main()
    {
        int []p1={1,2,3,4,5};
        int sum=0;
        for(int t:p1)
        {
            sum+=t;
            System.out.println(t);
        }
        System.out.println(sum);
    }
}