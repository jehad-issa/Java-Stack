public class TestBankAcount {
    public static void main(String[] args) {
    // Accounts 
    BankAccount account1 = new BankAccount();
    BankAccount account2 = new BankAccount();
    BankAccount account3 = new BankAccount();

    account1.depositMoney(300, "Checking");
    account1.display();

    account1.withdrawMoney(300, "Checking");
    account1.display();

    
    }
}