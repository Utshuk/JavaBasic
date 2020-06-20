package practice_03;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        //user input for string
        System.out.println("Enter your name:");
        String name = in.next();
        System.out.println("Your name is: "+ name);
        
        //user input for integer
        System.out.println("What is your age?");
        int age = in.nextInt();
        System.out.println("Your age is : " + age);
    
    }
    
}
