package interfacePattern;

public class Example2
{

    public static void main(String[] args)
    {
           int[] items = {1,2,3,4,5,6,7,10,13};
           Search s = new BinarySearch(items);
           System.out.println("Binary Search item is found on position :"+ s.getItem(14));
           
           s = new LinearSearch(items);
           System.out.println( "Linear Search item is found on position :"+ s.getItem(14));
    }

}
