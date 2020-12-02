
/**
 * Write a description of class equation_calculator_II here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class equation_calculator_II
{
    public static void main (String[] args)
    {
        Scanner user_input = new Scanner(System.in);
        
        String integer_under_10;
        System.out.print("Enter an integer under 10: ");
        integer_under_10 = user_input.next();
        
        String integer_under_9;
        System.out.print("Enter an integer under 9: ");
        integer_under_9 = user_input.next();
        
        String integer_over_2;
        System.out.print("Enter an integer over 2: ");
        integer_over_2 = user_input.next();
        
        String full_equation;
        full_equation = " " + integer_under_10 + " " + integer_under_9 + " " + integer_over_2 + " ";
        
        System.out.print("(4* " + integer_under_10 + ")(3* " + integer_under_9 + ")(7* " + integer_over_2 + ")10");
        
        System.out.println("x = 8");
        
    }
}
