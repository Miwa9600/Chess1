import java.util.ArrayList;
import java.util.HashMap;

public class ChessMain {

    public static void main (String[] args) {
        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayers();
        for (Player player: players){
            System.out.println(player);
        }
        HashMap<String,Piece> pieceHashMap = main.createPieces();
        System.out.println(pieceHashMap);
        main.play(players, pieceHashMap);

    }

    public ArrayList<Player> createPlayers(){
        Player whitePlayer = new Player("Beth Harmon", "beth.harmon@gmail.com", true,2000, 20);
        Player blackPlayer = new Player("Vasiliy Borgov", "vasiliy.borgov@gmail.com", false, 2500, 45);
        ArrayList<Player> players = new ArrayList<>();
        players.add(whitePlayer);
        players.add(blackPlayer);
        return players;
    }

    public HashMap<String, Piece> createPieces() {
        King whiteKing = new King(new Spot("h",7), "white_king", true);
        System.out.println(whiteKing);
        King blackKing = new King(new Spot("d",8), "black_king",false);
        Knight blackKnight1 = new Knight(new Spot("d",6), "black_knight", false);
        Rook whiteRook1 = new Rook(new Spot("a",7),"white_rook1",true);
        Rook whiteRook2 = new Rook(new Spot("g",7), "white_rook2", true);

        HashMap<String, Piece> pieceHashMap = new HashMap<>();
        pieceHashMap.put(whiteKing.getId(), whiteKing);
        pieceHashMap.put(whiteRook1.getId(),whiteRook1);
        pieceHashMap.put(whiteRook2.getId(),whiteRook2);
        pieceHashMap.put(blackKing.getId(),blackKing);
        pieceHashMap.put(blackKnight1.getId(), blackKnight1);
        return pieceHashMap;
    }

    public void play(ArrayList<Player> players, HashMap<String,Piece> hashMap){
        // first move
        players.get(0).movePiece(hashMap.get("white_rook1"), new Spot("a", 8));
        players.get(1).movePiece(hashMap.get("black_knight"), new Spot("с",8));

    }

}
