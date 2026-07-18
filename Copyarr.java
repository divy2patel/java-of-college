import java.util.*;
class Copyarr
{
    public static void main()
    {
        Scanner sr=new Scanner(System.in); 
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sr.nextInt();
        }
        int[] arr2=new int[arr.length*2];
        /*
        for(int i=0;i<5;i++)
        {
            arr2[i]=arr[i];
        }
        */
        System.arraycopy(arr,2,arr2,0,3);
        for(int i=0;i<5;i++)
            System.out.println(arr2[i]);
    }
}