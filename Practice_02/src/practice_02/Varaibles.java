
package practice_02;


public class Varaibles {

    public static void main(String[] args)
    {
        /*
        Data Types

        byte(number, 1 byte)
        short(number, 2 bytes)
        int (number, 4 bytes)
        long (number, 8 bytes)
        float (float number, 4 bytes)
        double(float number, 8 bytes)
        char(a character, 2 bytes)
        boolean( true or false, 1 byte)

    */
        int integerValue = 2;
        System.out.println(integerValue);
        
        double doubleValue= 4.5;
        System.out.println(doubleValue);
        
        char charValue = 'a';
        System.out.println(charValue);
        
        boolean boolValue = false;
        System.out.println(boolValue);
        
        String stringValue = "Hey!";
         System.out.println(stringValue);
        
         System.out.println(((Object) doubleValue).getClass().getName());
         
      

    }
    
}
