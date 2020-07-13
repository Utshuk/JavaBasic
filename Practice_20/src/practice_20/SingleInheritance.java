package practice_20;
//Parent Class
class Animal
{
   public void eat()
   {
       System.out.println("Eating...");
   }
}
//Child class
class Cat extends Animal
{
  public  void mewo()
  {
      System.out.println("Meoww....");
  }
}

public class SingleInheritance 
{

    public static void main(String[] args) 
    {
        Cat obj1 = new Cat();
        obj1.mewo();
        obj1.eat();
    }
    
}
