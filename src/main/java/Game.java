public class Game {
    public void validation(String choice){
        if(choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")){
            return;
        }else{
            throw new IllegalArgumentException("Invalid choice");
        }
    }
    public String judge(String player1, String player2){
        if ((player1.equals("rock") && player2.equals("scissors")) ||
                (player1.equals("scissors") && player2.equals("paper")) ||
                (player1.equals("paper") && player2.equals("rock"))){
            return "Player 1 win!";
        }else if ((player1.equals("rock") && player2.equals("paper")) ||
                (player1.equals("scissors") && player2.equals("rock")) ||
                (player1.equals("paper") && player2.equals("scissors"))){
            return "Player 2 win!";
        }else{
            return "Draw!";
        }

    }
}