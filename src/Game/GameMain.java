package Game;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Command game = new Command();

        game.display1();
        int command = sc.nextInt();
        sc.nextLine();

        while (command > 0) {
            if (command == 1) {
                game.command1();
                command = sc.nextInt();
                sc.nextLine();
            } else if (command == 2) {
                game.display2();
                String newGame = sc.nextLine();
                game.command2(newGame);
                game.command1();
                command = sc.nextInt();
                sc.nextLine();
            } else if (command == 3) {
                game.display3();
                String removeGame = sc.nextLine();
                game.command3(removeGame);
                game.command1();
                command = sc.nextInt();
                sc.nextLine();
            } else if (command == 4) {
                game.display4();
                int index = sc.nextInt();
                sc.nextLine();
                if (index > 0 && index <= game.getGames().size()) {
                    game.display4_1(index -1);
                    String updateGame = sc.nextLine();
                    game.command4(index -1 , updateGame);
                    game.display4_2();
                    game.command1();
                    command = sc.nextInt();
                    sc.nextLine();
                } else {
                    System.out.println("Please try again!");
                }
            } else if (command == 5) {
                System.out.println("Exit");
                break;
            } else {
                System.out.println("Please input again!");
                command = sc.nextInt();

            }
        }
    }
}
