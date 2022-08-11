import java.util.ArrayList;

public class ChessMain {

    public static void main (String[] args) {
        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayers();
        for (Player player: players){
            System.out.println(player);
        }

    }

    public ArrayList<Player> createPlayers(){
        Player whitePlayer = new Player("Beth Harmon", "beth.harmon@gmail.com", true,2000, 20);
        Player blackPlayer = new Player("Vasiliy Borgov", "vasiliy.borgov@gmail.com", false, 2500, 45);
        ArrayList<Player> players = new ArrayList<>();
        players.add(whitePlayer);
        players.add(blackPlayer);
        return players;
    }
}
