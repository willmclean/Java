
/**
 * Have the user input a value saying which application they would like to use then input the necessary values to have the machine give them an answer.
 *
 * @author (Will McLean)
 * @version (1.0)
 */
import java.util.Scanner;
public class java_math_functions
{
    public static void main(String[] args)
    {
       System.out.println('\u000C');
        
       double xValue;
       double yValue;
       double zValue;
       
       Scanner inputScanner = new Scanner(System.in);
       int decision;
       
       System.out.println("This program will help you solve specific math equations. You must choose which equation type you need solved");
       System.out.println("Choose 1 to find the highest value");
       System.out.println("Choose 2 to find the lowest value");
       System.out.println("Choose 3 to find the square root");
       System.out.println("Choose 4 to find the absolute value");
       System.out.println("Choose 5 to get a random number");
       System.out.println("Choose 6 to find x to the power of y");
       decision = inputScanner.nextInt();
       System.out.println("You choose " + decision + "."); 
       
       if (decision == 1) //Math.max
       {
           System.out.println("Input two different values and you will get the higher number back.");
           System.out.println("Please input a value for x: ");
           int x = inputScanner.nextInt();
           System.out.println("Please input a value for y: ");
           int y  = inputScanner.nextInt();
           System.out.println("Math.max(" + x + "," + y + ")= " + Math.max(x, y));
       }
       else if (decision == 2) //Math.min
       {
           System.out.println("Input two different values and you will get the lower number back.");
           System.out.println("Please input a value for x: ");
           int x = inputScanner.nextInt();
           System.out.println("Please input a value for y: ");
           int y  = inputScanner.nextInt();
           System.out.println("Math.min(" + x + "," + y + ")= " + Math.min(x, y)); 
       }
       else if (decision == 3) //Math.sqrt
       {
           System.out.println("Input one value and then you will get the square root of the number back.");
           System.out.println("Input a value for x: ");
           double x = inputScanner.nextInt();
           System.out.println("Math.sqrt(" + x + ")= " + Math.sqrt(x));
       }
       else if (decision == 4) //Math.abs
       {
           System.out.println("Input a value and you will get the absolute value of the number back.");
           System.out.println("Input a value for x: ");
           double x = inputScanner.nextInt();
           System.out.println("Math.abs(" + x + ")= " + Math.abs(x));
       }
       else if (decision == 5) //Math.random
       {
           System.out.println("Input two values and you will get an equation using those numbers and a random generated number.");
           System.out.println("Input a value for x: ");
           int x = inputScanner.nextInt();
           System.out.println("Input a value for y: ");
           int y = inputScanner.nextInt();
           int number = (int) (Math.random()*x) + y;
           System.out.println(number);
       }
       else if (decision == 6) //Math.pow
       {
           System.out.println("Input two values and the first value will go to the power of the second number.");
           System.out.println("Input a value for x: ");
           int x = inputScanner.nextInt();
           System.out.println("Input a value for y: ");
           int y = inputScanner.nextInt();
           
           zValue = Math.pow(x, y);
           System.out.println("Your answer is " + zValue + ".");
       }
       else if (decision > 6)
       {
           System.out.println("Sorry, you need to use a number from 1 to 6 to use this application.");
       }
       else if (decision < 1)
       {
           System.out.println("Sorry, you need to use a number from 1 to 6 to use this application.");
       }
    }
}
