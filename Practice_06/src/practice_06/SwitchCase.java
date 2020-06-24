package practice_06;
public class SwitchCase 
{
   public static void main(String[] args) 
   {
      char choice = 'c';
      switch(choice)
      {
          case 'a':
              System.out.println("Inside case a");
              break;
          case 'b':
              System.out.println("Inside case b");
              break;
          case 'c':
              System.out.println("Inside case c");
              break;
          default:
              System.out.println("Inside default block.");
      }
       System.out.println("Outside of switch case.");
   }
    
}
