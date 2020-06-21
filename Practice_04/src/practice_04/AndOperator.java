
package practice_04;

public class AndOperator 
{
    public static void main(String[] args) 
    {
        int number1 = 1, 
	number2 = 2, 
	number3 = 3; 
        boolean result;
        result = (number1< number2) && (number3 > number1);
        System.out.println(result);
        
        result = (number1>number2)  && (number3 > number1);
        System.out.println(result);

        result = (number1< number2) && (number3 < number1);
        System.out.println(result);

        result = (number1> number2) && (number3 < number1);
        System.out.println(result);


    }
}
