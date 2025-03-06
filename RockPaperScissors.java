import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of games: ");
        int games = scanner.nextInt();
        
        String[][] results = new String[games][3];
        int playerWins = 0, computerWins = 0;
        
        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String playerChoice = scanner.next().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = determineWinner(playerChoice, computerChoice);
            
            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;
            
            results[i][0] = playerChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
        }
        
        displayResults(results, playerWins, computerWins, games);
    }

    static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[(int)(Math.random() * 3)];
    }

    static String determineWinner(String player, String computer) {
        if (player.equals(computer)) return "Draw";
        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("scissors") && computer.equals("paper")) ||
            (player.equals("paper") && computer.equals("rock"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    static void displayResults(String[][] results, int playerWins, int computerWins, int totalGames) {
        System.out.println("\nGame Results:");
        System.out.println("Player Choice\tComputer Choice\tWinner");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i][0] + "\t\t" + results[i][1] + "\t\t" + results[i][2]);
        }
        
        double playerWinPercentage = ((double) playerWins / totalGames) * 100;
        double computerWinPercentage = ((double) computerWins / totalGames) * 100;
        
        System.out.println("\nFinal Stats:");
        System.out.println("Player Wins: " + playerWins + " (" + String.format("%.2f", playerWinPercentage) + "%)");
        System.out.println("Computer Wins: " + computerWins + " (" + String.format("%.2f", computerWinPercentage) + "%)");
    }
}
