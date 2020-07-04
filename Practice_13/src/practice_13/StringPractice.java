package practice_13;
public class StringPractice 
{
    public static void main(String[] args) 
    {
        //Creating a string
        String str1 = "Welcome to Utshuk Tech!";
        System.out.println(str1);
        
        //Substring 
        System.out.println(str1.substring(0,7));
        
        //Concatenation of string
        String str2 ="Hello"+"World!";
        System.out.println(str2);
        
        //Some imp methods of string
        //1. .equals
        String str3 = "Hello";
        String str4="Hello";
        System.out.println(str3.equals(str4));
        
        // ==
        String str5 = new String("Hello");
        String str6 = new String("Hello");
        System.out.println(str5 == str6);
        System.out.println(str5.equalsIgnoreCase(str6));
        
        //2 .length()
        System.out.println(str5.length());
        
        //3. .toUpperCase
        System.out.println(str5.toUpperCase());
        
        

    }
    
}
