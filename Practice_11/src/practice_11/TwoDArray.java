package practice_11;
public class TwoDArray
{    
    public static void main(String[] args)
    {
        int[][] arr = {         //jagged array
                        {1,2,3},
                        {4,5,6,7,8},
                        {7,8,9,10}
                      };
        //accessing value of 2DArray
//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
        
        for(int i =0; i<arr.length; i++)
        {
            for(int j =0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
