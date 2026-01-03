public class Main {

    public static void main(String[] args) {
        
        // Creating our players
        Player player1 = new Player(3000, "Mauricio");
        Player player2 = new Player(3000, "Jackie");
        Player player3 = new Player(3000, "Yoda");
        Player player4 = new Player(3000, "Nebby");

        // List of Players
        Player players[] = {player1, player2, player3, player4};
        Bank bank = new Bank();

        // Test Depositting or Withdrawing
        bank.Deposit(500, players[1]);
        bank.Withdraw(1000, players[1]);
        
        for(Player player: players){
            player.displayInfo();
        }

        // Referencing Property Class
        Properties p = new Properties();
        // Display Available Properties
        p.displayInfo();

        Board b = new Board();
        b.displayInfo();
        
        System.out.println(" " + b.rollDice());

    }
}
