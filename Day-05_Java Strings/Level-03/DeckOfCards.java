import java.util.Scanner;

public class DeckOfCards {

    // Suits and Ranks
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                             "Jack", "Queen", "King", "Ace"};

    // Initialize the deck
    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Shuffle the deck
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Distribute cards to players
    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        if (numPlayers * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }

        String[][] players = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Print players and their cards (using enhanced for loop)
    public static void printPlayers(String[][] players) {
        if (players == null) return;

        int playerNum = 1;
        for (String[] playerCards : players) {
            System.out.println("Player " + playerNum + "'s cards:");
            for (String card : playerCards) {
                System.out.println("  " + card);
            }
            System.out.println();
            playerNum++;
        }
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Initialize and shuffle deck
            String[] deck = initializeDeck();
            deck = shuffleDeck(deck);

            // Input number of players and cards per player
            System.out.print("Enter number of players: ");
            int numPlayers = sc.nextInt();
            System.out.print("Enter number of cards per player: ");
            int cardsPerPlayer = sc.nextInt();

            // Distribute and print
            String[][] players = distributeCards(deck, numPlayers, cardsPerPlayer);
            printPlayers(players);
        }
    }
}

