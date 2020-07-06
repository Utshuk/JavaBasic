package practice_14;
public class OOP
{
    public static class MyClass
    {
        private int integerVar = 10; //Data
        
        //Method
        public void value()
        {
            System.out.println("Value = "+ integerVar);
        }
    }
    public static void main(String[] args) 
    {
        MyClass obj1 = new MyClass();
        obj1.value();       
    }
    
}
