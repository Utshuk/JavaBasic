package practice_16;

public class MethodOverloading 
{
    //1. Number of Parameters
    public static int add(int a, int b)
    {
        return a+b;
    }
    public static int add(int a, int b, int c)
    {
        return a+b+c;
    }
    //2. Datatype of Parameter
    public static double add(double a, double b)
    {
        return a+b;
    }
    //invalid method overloading
//    public static double add(int a, int b)
//    {
//        
//    }
            
            
    public static void main(String[] args) 
    {
        
        System.out.println("Sum = "+ add(1,2));
        System.out.println("Sum = "+ add(1,2,3));
        System.out.println("Sum = "+ add(5.5, 4.5));
    }
    
}
