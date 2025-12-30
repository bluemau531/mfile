public class Bank {
    
    // Amount to be... (Deposited, Withdrawn, etc.)
    private int amount;

    public void Deposit(int amount, Player player){
        // Get Player and Deposits Money
        player.setBalance(player.getBalance() + amount);
    }

    public void Withdraw(int amount, Player player){
        // Get Player and Withdraw's Money
        player.setBalance(player.getBalance() - amount);
    }

    
}
