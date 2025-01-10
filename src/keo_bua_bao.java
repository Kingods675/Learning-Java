import java.util.Scanner;

public class keo_bua_bao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] moves = {"rock", "paper", "scissors"};
        int scores = 0;
        while (true) {
            System.out.print("Player: ");
            String movePlayer = sc.nextLine().toLowerCase();
            int indexNum = (int) (Math.random() * moves.length);
            String moveBot = moves[indexNum];
            System.out.println("Bot: " + moves[indexNum]);

            if (movePlayer.equals("rock")) {
                if (moveBot.equals("rock")) {
                    System.out.println("Draw!");
                } else if (moveBot.equals("paper")) {
                    System.out.println("Bot win");
                    scores -= 1;
                } else if (moveBot.equals("scissors")) {
                    System.out.println("Player win");
                    scores += 1;
                }
            }
            else if (movePlayer.equals("paper")) {
                if (moveBot.equals("rock")) {
                    System.out.println("Player win");
                    scores += 1;
                } else if (moveBot.equals("paper")) {
                    System.out.println("Draw!");
                } else if (moveBot.equals("scissors")) {
                    System.out.println("Bot win");
                    scores -= 1;
                }
            } else if (movePlayer.equals("scissors")) {
                if (moveBot.equals("rock")) {
                    System.out.println("Bot win");
                    scores -= 1;
                } else if (moveBot.equals("paper")) {
                    System.out.println("Player win");
                    scores += 1;
                } else if (moveBot.equals("scissors")) {
                    System.out.println("Draw!");
                }
            } else if (movePlayer.equals("exit")) {
                System.out.println("Final Score: " + scores);
                break;
            } else  {
                System.out.println("Please type: rock, paper, scissors or exit" );
            }
            System.out.println("Score: " + scores);
        }
    }
}
