import java.util.*;
import java.io.*;

class Solution2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            long a = in.nextLong();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                long s = (long)(a + b * (Math.pow(2, j+1) - 1));
                System.out.print(s+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
