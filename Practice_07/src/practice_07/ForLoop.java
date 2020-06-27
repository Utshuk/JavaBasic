package practice_07;

public class ForLoop 
{
    public static void main(String[] args) 
    {
        for(int i= 1; i<=5; i++)
        {
            System.out.println("Hello");
        }
        
        int sum =0;
        for(int i=1; i<=10; i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum=" + sum);
    }
    
}
