
/**
 * The purpose of this is to have a user to input values for either the quadratic equation or pythagorean theorum and have the system give the answer.
 *
 * @author (Will McLean)
 * @version (1.0)
 */
import java.util.Scanner;
public class quadratic_pythagorean
{
    public static void main(String[] args)
    {
        System.out.println('\u000C');
        
        Scanner inputScanner = new Scanner(System.in);
        double aValue;
        double bValue;
        double cValue;
        double quadraticResult1;
        double quadraticResult2;
        double hypotenuseResult;
        int decision; 
        String playAgain = "yes";
        
        while (playAgain.equals("yes")) || playAgain.equals("Yes"))
        {
            System.out.println("This app can calculate either the pythagorean theorum or the quadratic equation.");
            System.out.println("Choose 1 for the pythagorean theorum.");
            System.out.println("Choose 2 for the quadratic equation.");
            decision = inputScanner.nextInt();
            System.out.println("You chose " + decision + ". Lets see what you can do");
        if (decision == 1) // Pythagorian Theorum
        {
            System.out.println("This will allow you to calculate the hypotenuse of a right triangle, but you need to input the values first.");
            System.out.print("Please input a value for A: ");
            aValue = inputScanner.nextDouble();
            System.out.print("Please input the value for B: ");
            bValue = inputScanner.nextDouble();
        
            hypotenuseResult = Math.sqrt(Math.pow(aValue, 2) + Math.pow(bValue, 2));
        
            System.out.println("The hypotenuse is: " + hypotenuseResult + ".");
        }
        else if (decision == 2) // Quadratic Equation
        {
            System.out.println("This will allow you to calculate th equadratic equation, but you need to input some values first.");
            System.out.print("Please input a value for A: ");
            aValue = inputScanner.nextDouble();
            System.out.print("Please input a value for B: ");
            bValue = inputScanner.nextDouble();
            System.out.print("Please input a value for C: ");
            cValue = inputScanner.nextDouble();
            
            quadraticResult1 = (-bValue + Math.sqrt(Math.pow(bValue, 2) - 4*aValue*cValue)) / (aValue);
            quadraticResult2 = (-bValue - Math.sqrt(Math.pow(bValue, 2) - 4*aValue*cValue)) / (aValue);
            
            System.out.println("The answer is " + quadraticResult1 + quadraticResult2 + ".");
        }
        
        System.out.println("Do you want to calculate another equation");
        System.out.println("Type in yes or no: ");
        System.out.println("Your choice: ");
        playAgain = inputScanner.nextInt();
    }
   }
}
