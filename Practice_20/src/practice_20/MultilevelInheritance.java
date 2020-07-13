package practice_20;

class Animal
{
    public void eat()
    {
        System.out.println("Eating...");
    }
        
}

//child class 1
class Cat extends  Animal
{
    public void meow()
    {
        System.out.println("Meow...");
        
    }
}
//Chlid class 2
class Kitten extends Cat
{
    public void drinkMilk()
    {
        System.out.println("Drinking Milk...");
    }
}


public class MultilevelInheritance 
{
    public static void main(String[] args) 
    {
        Kitten obj1 = new Kitten();
        obj1.drinkMilk();
        obj1.meow();
        obj1.eat();
        
    }
}
