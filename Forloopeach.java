import java.util.*;
class Forloopeach
{
    public static void main(String s[])
    {
        Scanner sr=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sr.nextInt();
        }
        for(int i:arr)
        {
            int n=0;
            i=n;
            n++;
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
    }
}