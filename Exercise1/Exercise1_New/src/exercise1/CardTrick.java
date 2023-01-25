package exercise1;
 
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 * This is the Branch Code
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022
 * @author Annette Sookraj Jan 23, 2023
 * 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)(1 + Math.random() * 13));
            card.setSuit(Card.SUITS[(int)(0 + Math.random() * 3)]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            hand [i] = card;
        }  
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        Scanner k = new Scanner(System.in);
        System.out.print("Enter a card value between 1 - 13 (11 for Jack, 12 for Queen, 13 for King): ");
        int value = k.nextInt();
        
        while (value < 0 || value > 13){
            System.out.print("Card value must be an integer between 1 and 13. Enter a card value: ");
            value = k.nextInt();
        }
        
        System.out.print("Enter a suit : ");
        String suit = k.next();
        while (suit.isEmpty()){
            System.out.print("Suit cannot be empty. Enter a valid card suit: ");
            suit = k.next();

        }

        // Then loop through the cards in the array to see if there's a match.
        
        for (int i = 0; i < hand.length; i++){
            if(hand[i].getValue() == value || hand[i].getSuit().equalsIgnoreCase(suit)){
                printInfo();
            }
        }
        }
        // If the guess is successful, invoke the printInfo() method below.

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     * @author Annette Sookraj Jan 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Annette");
        System.out.println();
        
        System.out.println("My goals:");
        System.out.println("-- Find a successful co-op placement");
        System.out.println("-- Pass all my courses");
	System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Reading");
        System.out.println("-- Gaming");
        System.out.println("-- Watching TV");

        System.out.println();
    }

}
