package practice_17;
public class StaticMethod 
{
    public static void method1()
    {
        System.out.println("Inside Static method..");
    }
    public void method2()
    {
        System.out.println("Inside non-static method.");
    }
    public static void main(String[] args) 
    {
       method1();
       StaticMethod obj1 = new StaticMethod();
       obj1.method2();
    }
    
}
