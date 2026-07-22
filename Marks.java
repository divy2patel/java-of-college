import java.util.*;

class Marks
{
    public static void main(String s[])
    {
        Scanner sr= new Scanner (System.in);
        int n;
        System.out.println("Enter the marks:");
        n=sr.nextInt();
        if(n>=90&&n<=100)
        {
            System.out.println("Gread:A");
        }
        else if(n>=80&&n<90)
        {
            System.out.println("Gread:B");
        }
        else if(n>=70&&n<80)
        {
            System.out.println("Gread:C");
        }
        else if(n>=60&&n<70)
        {
            System.out.println("Gread:D");
        }
        else if(n>=35&&n<60)
        {
            System.out.println("Gread:E");
        }
        else{
            System.out.println("Gread:F");
        }
    }
}