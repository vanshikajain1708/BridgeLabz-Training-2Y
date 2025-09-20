import java.util.Scanner;

public class RockPaperScissors {

    // Method to get computer choice
    public static String getComputerChoice() {
        double rand = Math.random();
        if (rand < 0.33) return "Rock";
        else if (rand < 0.66) return "Paper";
        else return "Scissors";
    }

    // Method to find winner using switch expression
    public static String findWinner(String userChoice, String computerChoice) {
        return switch (userChoice.toLowerCase()) {
            case "rock" -> switch (computerChoice.toLowerCase()) {
                case "rock" -> "Draw";
                case "paper" -> "Computer";
                case "scissors" -> "User";
                default -> "Invalid";
            };
            case "paper" -> switch (computerChoice.toLowerCase()) {
                case "rock" -> "User";
                case "paper" -> "Draw";
                case "scissors" -> "Computer";
                default -> "Invalid";
            };
            case "scissors" -> switch (computerChoice.toLowerCase()) {
                case "rock" -> "Computer";
                case "paper" -> "User";
                case "scissors" -> "Draw";
                default -> "Invalid";
            };
            default -> "Invalid";
        };
    }

    // Method to calculate stats: average and percentage wins
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        double userPercentage = (userWins * 100.0) / totalGames;
        double computerPercentage = (computerWins * 100.0) / totalGames;

        String[][] stats = new String[2][2];
        stats[0][0] = "User Wins";
        stats[0][1] = userWins + " (" + String.format("%.2f", userPercentage) + "%)";
        stats[1][0] = "Computer Wins";
        stats[1][1] = computerWins + " (" + String.format("%.2f", computerPercentage) + "%)";

        return stats;
    }

    // Method to display results of each game and stats
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.printf("%-10s%-15s%-15s%-10s%n", "Game", "User Choice", "Computer Choice", "Winner");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("%-10s%-15s%-15s%-10s%n",
                    i + 1,
                    gameResults[i][0],
                    gameResults[i][1],
                    gameResults[i][2]);
        }
        System.out.println("\nSummary:");
        System.out.printf("%-15s%-15s%n", stats[0][0], stats[0][1]);
        System.out.printf("%-15s%-15s%n", stats[1][0], stats[1][1]);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of games you want to play: ");
            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            String[][] gameResults = new String[n][3]; // userChoice, computerChoice, winner
            int userWins = 0, computerWins = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Enter your choice for game " + (i + 1) + " (Rock/Paper/Scissors): ");
                String userChoice = sc.nextLine();
                String computerChoice = getComputerChoice();
                String winner = findWinner(userChoice, computerChoice);

                if (winner.equals("User")) userWins++;
                else if (winner.equals("Computer")) computerWins++;

                gameResults[i][0] = userChoice;
                gameResults[i][1] = computerChoice;
                gameResults[i][2] = winner;
            }

            String[][] stats = calculateStats(userWins, computerWins, n);
            displayResults(gameResults, stats);
        }
    }
}

