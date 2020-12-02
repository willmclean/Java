
/**
 * Use scanner to have a user input to help write the madlibs paragraph.
 *
 * @author (Will McLean)
 * @version (1.1)
 */
import java.util.Scanner;
public class madlibs
{
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);
        
        String plural_noun;
        System.out.print("Enter one plural noun: ");
        plural_noun = user_input.next();
        
        String adjective;
        System.out.print("Enter one adjective: ");
        adjective = user_input.next();
        
        String verb_ending_in_ing;
        System.out.print("Enter one verb ending in ing: ");
        verb_ending_in_ing = user_input.next();
        
        String adverb;
        System.out.print("Enter one adverb: ");
        adverb = user_input.next();
        
        String singular_noun;
        System.out.print("Enter one singular noun: ");
        singular_noun = user_input.next();
        
        String verb_ending_in_g;
        System.out.print("Enter one verb ending in g: ");
        verb_ending_in_g = user_input.next();
        
        String full_paragraph;
        full_paragraph = " " + plural_noun + " " + adjective + " " + verb_ending_in_ing + " " + adverb + " " + singular_noun + " " + verb_ending_in_g;
        
        System.out.println("It was a beautiful day in " + plural_noun + " where it was " + adjective + " and warm. Nearby the planes were " + verb_ending_in_ing + " up for flight " + adverb + " and the people were watching."); 
        System.out.println("Among them was a little girl named " + singular_noun + " and she was " + verb_ending_in_g + " the planes, amazed by their beauty and for the rest of the day thats all she thought about.");
       
    }
}
