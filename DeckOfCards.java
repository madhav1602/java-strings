import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define card suits and ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        // Initialize the deck
        String[] deck = initializeDeck(suits, ranks);
        
        // Shuffle the deck
        shuffleDeck(deck);
        
        // Prompt user for number of players and cards per player
        System.out.print("Enter number of players: ");
        int players = scanner.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();
        
        // Distribute cards and print results
        distributeCards(deck, players, cardsPerPlayer);
    }

    // Method to initialize the deck of cards
    static String[] initializeDeck(String[] suits, String[] ranks) {
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }

    // Method to shuffle the deck using Fisher-Yates shuffle algorithm
    static void shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            // Swap cards at index i and j
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    // Method to distribute cards to players and display their hands
    static void distributeCards(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards for all players.");
            return;
        }
        
        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.println(deck[i * cardsPerPlayer + j]);
            }
            System.out.println();
        }
    }
}
