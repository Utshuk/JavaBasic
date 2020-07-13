package practice_20;

//Parent Class
class Animal
{
    public void eat()
    {
        System.out.println("Eating...");
    }
}
//child class
class Cat extends Animal
{
    public void meow()
    {
        System.out.println("Meow...");
    }
}
//child class
class Dog extends Animal
{
    public void bark()
    {
        System.out.println("barking...");
    }
}
public class HierarchicalClass 
{
    public static void main(String[] args) {
        
        Cat obj1 = new Cat();
        obj1.meow();
        obj1.eat();
        Dog obj2 = new Dog();
        obj2.eat();
        obj2.bark();
    }
}
