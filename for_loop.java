
/**
 * The code will have the user input a value and the code will write out the number to that number while adding them up as it goes along with the sum being put at the end.
 *
 * @author (Will McLean)
 * @version (1.0)
 */
import java.util.Scanner;
public class for_loop
{
    public static void main( String[] args )
    {
        System.out.print('\u000C');
        
        Scanner inputScanner = new Scanner(System.in);

        System.out.println( "Number: " );
        int value = inputScanner.nextInt();
        int sum = 0;

        for (int run=1; run<=value; run=run+1)
        {
            System.out.print( run + " " );
            sum = sum + run; 
        }

        System.out.println( "The sum is " + sum );

    }
}
