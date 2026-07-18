import java.util.*;
class Arr2d
{
    public static void main()
    {
        Scanner sr=new Scanner(System.in);

        int [][]arr=new int[4][4];

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[i][j]=sr.nextInt();
            }
        }
        
        for(int[] row:arr)
        {
            for(int co:row)
            {
                System.out.print(co+" ");
            }
            System.out.println();
        }
    }
}