package practice_10;

public class OneDimensionalArray 
{

    public static void main(String[] args)
    {
        int[] myIntegerArray = new int[]{1,2,3,4,5};
//        System.out.println(myIntegerArray[0]);
//        System.out.println(myIntegerArray[1]);
//        System.out.println(myIntegerArray.length);
        for(int i = 0; i<myIntegerArray.length; i++)
        {
            System.out.println(myIntegerArray[i]);
        }
        for(int i: myIntegerArray)
        {
            System.out.println(i);
        }
       
    }
    
}
