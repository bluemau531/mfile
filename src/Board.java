import java.util.ArrayList;
import java.util.Random;

public class Board {

    private Properties property;
    private ArrayList<String> gameBoard;
    private int size;
    private Player player;



    public Board(){
        property = new Properties();
        gameBoard = property.getAllProperties();
        size = gameBoard.size();
    }

    public int rollDice(){
        Random r = new Random();
        int rr = r.nextInt(6);
        return rr;
    }


    public void displayInfo(){
        System.out.println(gameBoard);
    }


}
