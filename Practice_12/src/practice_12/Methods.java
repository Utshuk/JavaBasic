package practice_12;
public class Methods
{
    //1. Method with noargument and no return type
    public static void sum()
    {
        int a=5, b=5;
        int sum = a+b;
        System.out.println("sum = "+ sum);
    }
    
    //2.Method with return type but no arguments 
    public static int sub()
    {
        int a=10, b=5;
        int diff=a-b;
        return diff;
    }
    
    //3.Method with argument but no returntype
    public static void mul(int a , int b)
    {
        System.out.println("mul= "+ a*b);
    }
    
    //4.Method with both argument and returntype
    public static double div(double a, double b)
    {
//      double divide= a/b;
        return a/b;
    }
    
    public static void main(String[] args)
      {
          sum();
//        int subtract=sub();
          System.out.println("sub= "+ sub());
          mul(5,6);
          System.out.println("division = "+ div(10.5,5.5));
          mul(6,6);          
      }
    
}
