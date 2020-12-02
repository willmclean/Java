
/**
 * This is a step by step game that allows the play to make decisions using if else statements.
 *
 * @author (Will McLean)
 * @version (1.0)
 */
import java.util.Scanner;
public class Java_Adventure_Game
{
     public static void main(String[] args)
     {
      System.out.println('\u000C');
        
      double xValue;
      double yValue;
      double zValue;
        
      Scanner inputScanner = new Scanner(System.in);
      int name;
       
      Scanner inputScanner2 = new Scanner(System.in);
      int decision;
       
      Scanner inputScanner3 = new Scanner(System.in);
      int answer;
       
      String playAgain = "yes";
      while (playAgain.equals("yes") || playAgain.equals("Yes"))
      {
       System.out.println("Welcome to the game of your life: The Adventure of Link. I hope you have a fun time. And also, remember to choose wisely or your demise you might find.");
       System.out.println("Have fun.");
       System.out.println("Choose 1 if you want to play and 2 if you don't: ");
       decision = inputScanner.nextInt();
       if (decision == 1) //Start the game 
       {
           System.out.println("Here we see our hero walking down a path where he comes across two men who aproach you with their weapons raised. What do you do?");
           System.out.println("Choose 1 to fight them, choose 2 to run back the way you came, or choose 3 to run around them: ");
           decision = inputScanner.nextInt();
           if(decision == 1)
           {
               System.out.println("Oh no! The two men combined were to much for you and they overpowered you.");
               System.out.println("GAME OVER");
               System.out.println("Do you want to play again?");
               System.out.println("Type yes or no: ");
               playAgain = inputScanner.next();
           }
           
           if(decision == 2)
           {
               System.out.println("Oh no! They were to fast for you in a straight line. Next time, try to use your agility to get around them.");
               System.out.println("GAME OVER");
               System.out.println("Do you want to play again?");
               System.out.println("Type yes or no: ");
               playAgain = inputScanner.next();
           }
           
           if(decision == 3)
           {
               System.out.println("Congrats! you were able to get past the men. Level one complete. Choose 1 to continue or 3 to stop.");
               decision = inputScanner.nextInt();
           }
           if(decision == 1)
           {
               System.out.println("Welcome to Level 2!");
               System.out.println("Now you have come to a river that you need to cross. You must choose 1 to swim through or 2 to find a way around.");
               decision = inputScanner.nextInt();
           }
           if (decision == 1)
           {
               System.out.println("When you tried to swim across the water you got to cold to continue and drowned. Better luck next time.");
               System.out.println("GAME OVER");
               System.out.println("Do you want to play again?");
               System.out.println("Type yes or no: ");
               playAgain = inputScanner.next();
           }
           if (decision == 2)
           {
               System.out.println("Nice job. You were able to find a log to cross the river with."); 
               System.out.println("You are on your way to Level 3!");
               System.out.println("Are you ready? 1 for yes, 2 for no.");
               decision = inputScanner.nextInt();
           }
           if (decision == 1) 
           {
               System.out.println("LEVEL 3!");
               System.out.println("You come across a platoon of fighters, what do you do? Choose 1 to fight, 2 to sneak around, or 3 to run passed them.");
               decision = inputScanner.nextInt();
           }
           if (decision == 1)
           {
               System.out.println("The fighters were too strong. You were captured.");
               System.out.println("GAME OVER");
               System.out.println("Do you want to play again?");
               System.out.println("Type yes or no: ");
               playAgain = inputScanner.next();
           }
           if (decision == 2)
           {
               System.out.println("You were spotted tryingt to sneak around. You were captured.");
               System.out.println("GAME OVER");
               System.out.println("Do you want to play again?");
               System.out.println("Type yes or no: ");
               playAgain = inputScanner.next();
           }
           if (decision == 3)
           {
               System.out.println("Bravo, you took the platoon by surprise and they did not react fast enough to catch you.");
               System.out.println("LEVEL 4!");
               System.out.println("While journeying you find a massive mountain with an item at the top that will help you with your quest. Do you want to go for it or not? Choose 1 for no choose 2 for yes.");
               decision = inputScanner.nextInt();
           }
           if (decision == 1)
           {
               System.out.println("While you were going along the side of the mountain, you got severe frostbite and suffered a painful death. That item may have been useful.");
               System.out.println("GAME OVER");
               System.out.println("Do you want to play again?");
               System.out.println("Type yes or no: ");
               playAgain = inputScanner.next();
           }
           if (decision == 2)
           {
               System.out.println("When you journeyed up to the top of the mountain, your were able to find the fire amulet, and when you use it, it summons fire like a dragon.");
               System.out.println("This is a tool you will need for later.");
               System.out.println("You are on your way to level 5. Congratulations.");
               System.out.println("Here you come across what appears to be a temple ruin. Do you want to go adventure the large structure, or pass by it? Choose 1 to pass by or choose 2 to adventure the structure.");
               decision = inputScanner.nextInt();
           }
           if (decision == 1)
           {
               System.out.println("You came across another platoon of people and they captured you.");
               System.out.println("GAME OVER");
               System.out.println("Do you want to play again?");
               System.out.println("Type yes or no: ");
               playAgain = inputScanner.next();
           }
           if (decision == 2)
           {
               System.out.println("Whislt exploring, you found what appears to be a hidden dungeon, do you want to pass through?");
               System.out.println("Choose 1 for yes or 2 for no: ");
               decision = inputScanner.nextInt();
               if (decision == 1)
               {
                   System.out.println("You found a stairwell leading down to the dungeon rooms of the temple. Here you find another amulet, but this time it is and amulet of frost.");
                   System.out.println("You are on your way to level 6. Bravo, I never thought you would get this far.");
                   System.out.println("Now, you adventure deeper into the dungeon and come face to face with the dangerous and explosive fire troll! Now would be a good time to use one of the amulets! Choose 1 for the frost amulet or choose 2 for the fire amulet.");
                   decision = inputScanner.nextInt();
                   if (decision == 1)
                   {
                       System.out.println("Nice job. Way to act on your toes. That fire troll will be frozen in ice for the rest of time.");
                       System.out.println("You are leading the way to level 7.");
                       System.out.println("You think to yourself as the dungeon keeps going deeper and deeper, 'what could possibly happen next?'");
                       System.out.println("You get your answer when you come face to face with the rock golem. This being, unlike the troll can't be easily defeated. You need to figure out a way to stop him before he stops you!");
                       System.out.println("Choose 1 to try and use both of the amulets at the same time or you use the sword you have had since the start.");
                       decision = inputScanner.nextInt();
                       if (decision == 1)
                       {
                           System.out.println("The combined power of the heat and the cold was just enough for you to damage the golem enough to make him move out of the way. Nice job.");
                           System.out.println("Level 8. Getting close my friend.");
                           System.out.println("The next obsticale you come by is a test of witts not strength.");
                           System.out.println("You come across a door with a number lock. Next to the door there is a piece of paper with the equation 6x + 78 = 186.What is the number to unlock the door? ");
                           answer = inputScanner.nextInt();
                           if (answer == 18)
                           {
                               System.out.println("That number opened up the door. You are very close now.");
                               System.out.println("Behind the door were two long hallways. At the end of one hallway, there is a room full of treasure and at the end of the other hallway is a map that will take you another room of treasure. Choose 1 for the first hallway or 2 for the second hallway: ");
                               decision = inputScanner.nextInt();
                               if (decision == 1)
                               {
                                   System.out.println("Level 10!");
                                   System.out.println("Once you enter the room, you realize the sheer amount of treasure in there. You have a choice: do you want to take all of the treasure home or do you want to take the most valuble treasure? Choose 1 to take all of it or choose 2 to take the most valuble pieces: ");
                                   decision = inputScanner.nextInt();
                                   if (decision == 1)
                                   {
                                       System.out.println("While trying to take all of the treasure, a group of people came up behind you and attacked and stole all of the treasure from you.");
                                       System.out.println("GAME OVER");
                                       System.out.println("Do you want to play again?");
                                       System.out.println("Type yes or no: ");
                                       playAgain = inputScanner.next();
                                   }
                                   if (decision == 2)
                                   {
                                       System.out.println("You were able to get all of the valubles into your bag. Nobody suspected anything!");
                                       System.out.println("Congradualtions! You beat the game!");
                                       System.out.println("Do you want to play again?");
                                       System.out.println("Type yes or no: ");
                                       playAgain = inputScanner.next();
                                   }
                               }
                               if (decision == 2)
                               {
                                   System.out.println("Level 10!");
                                   System.out.println("When looking at the map you realize that the destination is very far away, do you risk the journey to get to the prize? Choose 1 for yes or choose 2 for no: ");
                                   decision = inputScanner.nextInt();
                                   if (decision == 1)
                                   {
                                       System.out.println("When you headed to the vault, you were joined by a person who you got to know. You told them about the room and how you were going there. He offered to help you and you agreed.");
                                       System.out.println("Once you reached the vault, you pushed the door in a oogled at the massive amounts of treasure there. Once there you and your new friend took the treasure and then live the rest of your life in the kingdom.");
                                       System.out.println("Congradulations! You beat the game!");
                                       System.out.println("Do you want to play again?");
                                       System.out.println("Type yes or no: ");
                                       playAgain = inputScanner.next();
                                   }
                                   if (decision == 2)
                                   {
                                       System.out.println("After looking at the map you decided against going that far. While journeying back, you came across the rock golem again and this time you could not over power him.");
                                       System.out.println("GAME OVER");
                                       System.out.println("Do you want to play again?");
                                       System.out.println("Type yes or no: ");
                                       playAgain = inputScanner.next();
                                   }
                               }
                           }
                       }
                   }
                   if (decision == 2)
                   {
                       System.out.println("That fire amulet did nothing against the fire troll. He rushed at you and you perished.");
                       System.out.println("GAME OVER");
                       System.out.println("Do you want to play again?");
                       System.out.println("Type yes or no: ");
                       playAgain = inputScanner.next();
                   }
               }
               if (decision == 2)
               {
                   System.out.println("While going around the outside, you fell into a large pit with no way out. You must wait there until the end of time.");
                   System.out.println("GAME OVER");
                   System.out.println("Do you want to play again?");
                   System.out.println("Type yes or no: ");
                   playAgain = inputScanner.next();
               }
           }
           
           if (decision == 3)
           {
               System.out.println("Alright, have a nice day.");
           }
       }
       else if (decision == 2)
       {
           System.out.println("That is a shame, this is a fun game.");
       }
       System.out.println("Do you want to play again?");
       System.out.println("Type yes or no: ");
       playAgain = inputScanner.next();
    }
   }
}
