
/**
 *
 * @author q797557
 */
public class Account {
    
    private double balance;
    
    //constructor
    public Account ( double initialBalance )
    {
        if (initialBalance > 0.0 )
            balance = initialBalance;
    }
    public void credit(double amount)
    {
        balance = balance + amount;
    }
    public void debit(double amount)
    {
        if (balance >= amount)
            balance = balance - amount;
        else System.out.printf("Debit amount cannot exceed $%.2f.", balance);
    }
    public double getBalance()
    {
        return balance;
    }
}
