package practice_21;

//super class
class Car
{
    public void speedLimit()
    {
        System.out.println("The speed limit of car...");
    }
        
}
//child class
class Bugatti extends Car
{
    public void speedLimit()
    {
        System.out.println("The speed limit of Bugatti is 260 mph.");
    }
}
//chlid class 2
class Tesla extends Car
{
    public void speedLimit()
    {
        System.out.println("The speed limit of Tesla is 255 mph.");
    }
}
public class polymorphism 
{
    public static void main(String[] args) 
    {
       Car obj1 = new Bugatti();
       obj1.speedLimit();
       Car obj2 = new Tesla();
       obj2.speedLimit();
    }
}
