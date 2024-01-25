public class BankAccount
{
    private int accID;
    public double balance;
    
    public void setaccID(int id)//method 1. 'Void' also mean this method or function has alredy be an output, u don't need to return value
    {
        accID=id;
    }

    public void deposit(int amt)//method 1. 'Void' also mean this method or function has alredy be an output, u don't need to return value
    {
        balance = balance + amt;
    }
    
    public void withdraw(int amt)//method 2
    {
        balance = balance - amt;
    }
    
    public double getBalance()//this is input.If we get an output, it needs output. Which means this whole method is an output now.
    {
        return balance;//this is output
    }
    
    public int getID()
    {
        return accID;
    }
    
    public String toString();
    {
        String output = "Your account ID is = " + accID + "\n Your balance is = " + balance;
        
        return output;
    }
}