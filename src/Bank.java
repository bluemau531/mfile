public class Bank {
    
    private int amount;

    public void Deposit(int amount, Player player){
        // Get Player and Deposits Money
        player.setBalance(player.getBalance() + amount);
    }

    public void Withdraw(int amount, Player player){
        // Get Player and Withdraw's Money
        player.setBalance(player.getBalance() - amount);
    }

    



    // Bank(int amount, Player player){
    //     this.amount = amount;
    //     this.player = player;
    // }

    // public int Withdraw(int amount){
    //     int playerBalance = this.player.getBalance();
    //     this.player.setBalance(playerBalance - amount);
    //     return player.getBalance();
    // }

    // public int Deposit(int amount){
    //     int playerBalance = this.player.getBalance();
    //     this.player.setBalance(playerBalance + amount);
    //     return player.getBalance();
    // }

    // public void displayInfo(Player x){
    //     System.out.println(x.displayInfo());
    // }


}
