import java.util.Scanner;
class ForEachLoop{
    public static void main(String args[])
    {
        int[] arr = {10,20,30,40};
        for(int val:arr)
        {
            System.out.println(val);
        }
        String[]str = {"tokyo","india"};
        for(String c:str)
        {
            System.out.println(c);
        }
    }
}