import java.util.*;
class  Reverse2
{
    public static void main(String s[])
    {
        Scanner sr= new Scanner(System.in);
        int []list=new int[5];
        for(int i=0;i<5;i++)
        {
            list[i]=sr.nextInt();
        }
        int []rev=new int [5];
        rev=reverse(list);
        for(int i=0;i<5;i++)
            System.out.println(rev[i]);
    }
    static int[] reverse(int[] list) 
    {
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1;i < list.length; i++, j--)
        {
            result[j] = list[i];
        }
        return result;
    }
}