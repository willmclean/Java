
/**
 * Have a user input information and have tohe code respond with a "you got it" or a "wrong" phrase.
 *
 * @author (Will McLean)
 * @version (1.0)
 */
import java.util.Scanner;
public class if_then_else
{
    public static void main(String[] args)
    { 
        Scanner scan = new Scanner(System.in);
        
        String what_breed_of_dog_do_you_want;
        System.out.print("What breed of dog do you want? Breed of dog list: 1. Labrador, 2. Pitbull/Terrier, 3. Bulldog/Boxer, 4. Other ");
        int a = scan.nextInt();
        int breed = a;
        
        if(breed == 1)
        {
            System.out.println("I like that dog breed.");
        }
        else if(breed == 2)
        {
            System.out.println("That is my favorite breed of dog!");
        }
        else if(breed == 3)
        {
            System.out.println("They drool to much.");
        }
        else if(breed == 4)
        {
            System.out.println("I respect your decision.");
        }
        
        String what_size_do_you_want_your_dog_to_be;
        System.out.print("What size do you want your dog to be? Size scale: 1 = Small, 2 = medium, and 3 = large: ");
        int b = scan.nextInt();
        int size = b;
        
        if(size == 2)
        {
            System.out.println("Good Size");
        }
        else if(size == 1)
        {
            System.out.println("Too Small");
        }
        else if(size == 3)
        {
            System.out.println("Too Large");
        }
        
        String what_color_do_you_want_your_dog_to_be;
        System.out.print("What color do you want your dog to be? Color selector: 1 = Black, 2 = Brown, 3 = Grey, 4 = White, 5 = other: ");
        int c = scan.nextInt();
        int color = c;
        
        if(color == 1)
        {
            System.out.println("Good Color Choice");
        }
        else if(color == 2)
        {
            System.out.println("Good Color Choice");
        }
        else if(color == 3)
        {
            System.out.println("Good Color Choice");
        }
        else if(color == 4)
        {
            System.out.println("Good Color Choice");
        }
        else if(color == 5)
        {
            System.out.println("Good Color Choice");
        }
        
        System.out.println("That looks like a cool dog!");
    }
}
