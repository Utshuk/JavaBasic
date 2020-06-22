package practice_05;

public class ConditionalBranches {
    public static void main(String[] args) 
    {
       
        int integerValue =5;
        
        //if only condition
        if(integerValue==5)
        {
            System.out.println("The value is equals to 5");
        }
        System.out.println("Out of the if block");
        
        //if-else condition
        if(integerValue>5)
        {
            System.out.println("The value is greater than 5");
        }
        else
        {
            System.out.println("The value is not greater 5");
        }
        
        System.out.println("out of if else block");

        //if-elseif-else condition
        if(integerValue>5)
        {
            System.out.println("The value is greater than 5");
        }
        else if(integerValue==5)
        {
            System.out.println("The value is equal to 5");
        }
        else
        {
            System.out.println("The value is not greater than 5");
        }
        System.out.println("Out of if-else-if-else block");

    }
    
}
