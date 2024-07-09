//This program shows how to use Generics in Java

public class Generics {
    public static void main(String args[])
    {
        Integer arr[] = {1,2,3,1,5,9,1,40,1};
        System.out.println(count(arr,1));
    }

    public static <T> int count(T arr[], T x)
    {
        int count = 0;        //PUSH TO GITHUB!!!!
        for(T e : arr)
        {
            if(e.equals(x))
            {
                count++;
            }
        }
        return count;
    }
}