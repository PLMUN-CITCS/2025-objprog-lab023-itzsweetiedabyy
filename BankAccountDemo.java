public class BankAccountDemo {
    public static void main(String[] args) {
        
        
class BankAccount {
    public String accountHolder;  
    private double balance;       
    protected String accountType; 

    
    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }
}
        BankAccount myAccount = new BankAccount("Alice", 1150.0, "Checking");

        
        System.out.println("Account Holder: " + myAccount.accountHolder);
        System.out.println("Account Type: " + myAccount.accountType);
        System.out.println("Current Balance: $" + myAccount.getBalance());

      
    }
}
