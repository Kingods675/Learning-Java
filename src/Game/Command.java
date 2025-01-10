package Game;

import java.util.ArrayList;
import java.util.List;

public class Command {
    protected int index;
    protected String beforeUpdate;
    protected String afterUpdate;
    private ArrayList<String> games = new ArrayList<>(List.of("League of Legends", "Valorant", "Black Myth Wukong", "GTA 5"));

    public void display1() {
        System.out.println("Commands: ");
        System.out.println("1: Shows all the games in the library ");
        System.out.println("2: Add a game to library");
        System.out.println("3: Remove a game in library");
        System.out.println("4: Rename a game in library");
        System.out.println("5: Quit the program");
        System.out.println();
        System.out.print("Enter a command (1-5): ");
    }


    public void command1() {
        int counter = 1;
        for (String game : games) {
            System.out.println(counter++ + ": " + game);
        }
        System.out.println();
        System.out.print("Enter a command (1-5): ");
    }

    public void display2() {
        System.out.print("Enter name of the games: ");
    }

    public void command2(String newGame) {
        games.add(newGame);
    }

    public void display3() {
        System.out.print("Remove the name of the games: ");
    }

    public void command3(String removeGame) {
        if (!games.remove(removeGame)) {
            System.out.println("Game '" + removeGame + "' not found in the library.");
            System.out.println();
        }
    }

    public void display4() {
        System.out.print("Enter the game number to update: ");
    }

    public void display4_1(int index) {
        this.index = index;
        System.out.print("Enter new name for " + games.get(index) + ": ");
    }

    public void command4(int index, String updateGame) {
        this.index = index;
        this.beforeUpdate = games.get(index);
        System.out.println();
        games.set(index, updateGame);
        this.afterUpdate = updateGame;
    }

    public void display4_2() {
        System.out.println("Updated name from " + this.beforeUpdate + " to " + this.afterUpdate);
    }

    public ArrayList<String> getGames() {
        return this.games;
    }
}
