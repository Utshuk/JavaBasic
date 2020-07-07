package practice_15;
public class Practice_15 
{
    public static class MyClass
    {
        int integerVar=10;
        //Default Constructor
        public MyClass()
        {
            System.out.println("Inside Default Constructor.");
            System.out.println("Value = " + integerVar);
        }
        //parameterized Constructor
        public MyClass(int newIntegerVar)
        {
            System.out.println("Inside Parameterized Constructor");
            this.integerVar = newIntegerVar;
            System.out.println("Value of new integer = "+ integerVar);
        }
    }
    
    
    public static void main(String[] args) 
    {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(8);
        
        
    }
    
}
