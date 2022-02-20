import java.util.Scanner;
public class Main 
{
  public static void main(String[] args) 
  {
     Scanner input = new Scanner(System.in);
     String[] a = makeArray1();
     System.out.println("Please choose a word from the given list: \n");
     printArray(a);
     System.out.print("\n\nEnter your word: ");
     String word = input.nextLine();
     String wordL = word.toLowerCase();
     int index = wordIndex(a, wordL);
    
     if (index>-1)
     {
       System.out.println("The contradicting phrase that includes the word " + wordL + " is " + getOxymoron(index));

       System.out.println("Would you like to hear a story? Yes or No?");
       String storyA = input.nextLine();
       String storyALower = storyA.toLowerCase();

       if (storyALower.equals("yes"))
       {
         System.out.print("\n" + story(index));
         System.out.println("\nThanks for listening! Bye:)");
         
       }
       else
       {
         System.out.println("\nAlright, bye!");
       }
     }
     else
     {
       System.out.println("The word you entered is not in the given list. Please try again!");
     } 

    
  }

   public static String story(int index)
   {
     String beginning = "Once upon a time...\n";
     String[]  storyArray = { "an little old woman that played violin always attracted a SMALL CROWD around her. When a tall,big  boy was fascinated with the music, he wanted to learn how to play. The woman helped build him a big violin which was eventually named the cello, remembering how the old woman greeted him \"chello\" when he first saw her. ", "a big nation including very rural and urban parts had trouble spreading information quickly. By the time the rural people got information it was OLD NEWS! To solve this the nation created pigeons to deliver news much faster.","a cat lived in the city with its owner. The owner wrote their secrets on slips of paper and collected them in a big paper bag. One day, the owner forgot to place the bag on the shelf and the cat got inside. The cat twisted and turned to escape and finally the cat was let out of the bag. However, all the slips of paper flew out the window and into the city. They were now OPEN SECRETS, exposed to the whole city.","a mad scientist wanted to bring back his late wife. He collected ingredients and brought it to her grave on a full moon. By pouring it over the soil, the wife grew out of the soil like a big flower. She was the first of the LIVING DEAD that would blossom from the scientist's concoction. ","a little boy named Timmy was left alone in family's big mansion due to his busy parents always being preoccupied. The DEAFENING SILENCE of the big house frightened him and he wanted something that would always bring noise and comfort. He started on a grand project, building  2 small bug sized machines that would fit into his ears. He called them \"earbugs\" and their purpose was to bring him company on those lonley silent days by bringing noise.", "a penniless peasant was starved of food and his ONLY CHOICE was to steal bread from a local bakery. The baker who spent hard work crafting each bread roll noticed there was one missing from each dozen and realized it was the peasant's doing. As a result she began making an extra roll of bread for each dozen. She named this new amount the \"baker's dozen\" and carried on the tradition. "," a dude was PRETTY UGLY."," a middle school boy wanted to try out for his school track team; however, he was very slow and wasn't mobile enough. In fact, during try-outs all the other runners and the coach laughed at him so hard that they couldn't think straight. The other students who were trying out forgot what sport they were playing, and the coaches accidently accpeted him onto the team. He was so AWFULLY GOOD that he then went on to win every track meet."," a school boy's father wanted to pay for his son's school lunch everyday. The boy told his father that meals costed about five dollars. That, however, was AlMOST EXACTLY true. The meals costed $4.95 everyday. After the boy graduated high school nine years later, he accumlated enough money to buy himself a nice, warm bowl of delicious soup.  "};
     
     return beginning + storyArray[index];
   }
   public static String[] makeArray1()
   {
     String[] part1 = { "small", "old",
     "open","living","deafening", 
     "only","pretty", "awfully", "almost" };
     return part1;
   }
   public static int wordIndex(String[] array, String w)
   {
     int index = -1;  
     for (int i = 0; i<array.length; i++)
     { 
         if (array[i].equals(w))
         {
           index = i;
         }
     }
     return index;
   }

   public static String getOxymoron(int index)
   {
     String[]  contraArray = { "small crowd", "old news","open secret","living dead","deafening silence", "only choice","pretty ugly","awfully good","almost exactly"};
     return contraArray[index];
   }
   public static void printArray(String[] array)
   {
     System.out.print(array[0]);
     for (int i = 1; i<array.length;i++)
     {
       System.out.print(", "+ array[i]);
     } 
   }

}