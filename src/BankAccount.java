public class BankAccount implements User, IsDepositable, IsWithdrawable {

    static int id = 0;
    private final String name = "";
    public double total;


    public User(String name, double deposit) {
        id++;

        this.name = name;
        this.total = deposit;
    }

    private BankAccount(String name, double deposit) {
        super(name, deposit);
    }

    static User create(String name, double deposit) {
        System.out.println("Creando cuenta standard");

        return new BankAccount(name, deposit);
    }

    @Override
    public void deposit(double deposit) {
        this.total += deposit;
    }

    @Override
    public void withdraw(double undeposit) {
        this.total -= undeposit;
    }
}
