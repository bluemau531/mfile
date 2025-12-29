public class Main {
    
    public static void main(String[] args) {
        
        // Creating our players
        Player player = new Player(0, null);
        Player player1 = new Player(3000, "Mauricio");
        Player player2 = new Player(3000, "Jackie");
        Player player3 = new Player(3000, "Yoda");
        Player player4 = new Player(3000, "Nebby");

        // List of Players
        Player players[] = {player1, player2, player3, player4};
        Bank bank = new Bank();

        // Deposit $500 to this Player
        bank.Deposit(500, players[1]);
        bank.Withdraw(1000, players[1]);
    }
}
