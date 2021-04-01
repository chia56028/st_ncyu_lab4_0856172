import java.util.Scanner;

public class Main {
    public void main(){
        Game game = new Game();
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Welcome to Rock-Paper-Scissors game ===");

        String player1, player2;
        System.out.println("Enter Player 1 choice (rock, paper or scissors):");
        player1 = sc.nextLine();
        game.validation(player1);
        System.out.println("Enter Player 2 choice (rock, paper or scissors):");
        player2 = sc.nextLine();
        game.validation(player2);

        System.out.println(game.judge(player1, player2));

    }
}