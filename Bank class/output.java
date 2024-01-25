public class output{
    public static void main(String[] agrs)
    {
        BankAccount a = new BankAccount();
        BankAccount b = new BankAccount();

        a.setaccID(111111);
        b.setaccID(222222);

        a.deposit(500);
        b.deposit(700);

        a.withdraw(200);
        b.withdraw(500);

        b.deposit(500);
        a.withdraw(100);

        System.out.println(a.balance);
        System.out.println(b.balance);

    }
}