public class Player {
    
    private int balance;
    private String playerName;

    Player(int balance, String playerName){
        this.balance = balance;
        this.playerName = playerName;
    }

    // Set Player Balance
    public void setBalance(int balance){
        this.balance = balance;
    }

    // Get Player Balance
    public int getBalance(){
        return this.balance;
    }

    //Get Player Name
    public String getPlayerName(){
        return this.playerName;
    }

    public void displayInfo(){
        System.out.println("This is " + this.playerName +"'s balance: $" + this.balance);
    }

}
