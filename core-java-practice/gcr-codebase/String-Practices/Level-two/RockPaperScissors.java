import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int games = sc.nextInt();

        String[] options = {"Rock", "Paper", "Scissors"};

        int playerWin = 0;
        int computerWin = 0;

        for (int i = 1; i <= games; i++) {

            System.out.println("0-Rock 1-Paper 2-Scissors");
            int player = sc.nextInt();

            int computer = (int)(Math.random() * 3);

            System.out.println("Computer: " + options[computer]);

            if ((player == 0 && computer == 2) ||
                (player == 1 && computer == 0) ||
                (player == 2 && computer == 1))
                playerWin++;

            else if (player != computer)
                computerWin++;
        }

        System.out.println("Player Wins = " + playerWin);
        System.out.println("Computer Wins = " + computerWin);

        System.out.println("Player % = " + (playerWin * 100.0 / games));
        System.out.println("Computer % = " + (computerWin * 100.0 / games));
    }
}