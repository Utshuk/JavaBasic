package StaticVariable;

public class StaticVariable
{
    
    static int staticVar =5;
    int nonStaticVar =10;
    public static void main(String[] args) 
    {
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        
        obj1.staticVar = 6;
        obj1.nonStaticVar =11;
        
        obj2.staticVar = 7;
        obj2.nonStaticVar = 12;
        
        System.out.println("Obj1 staticVar = "+ obj1.staticVar);
        System.out.println("Obj1 nonStaticVar = "+ obj1.nonStaticVar);
        System.out.println("Obj2 staticVar = "+ obj2.staticVar);
        System.out.println("Obj2 nonStaticVar = "+ obj2.nonStaticVar);

    }
}
