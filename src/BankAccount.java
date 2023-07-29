public class BankAccount implements User, IsDepositable, IsWithdrawable {

    static int id = 0;
    private final String name;
    public double total;


    private BankAccount(String name, double deposit) {
        this.name = name;
        this.total = deposit;
    }

    static User create(String name, double deposit) {
        System.out.println("Creando cuenta standard");

        return new BankAccount(name, deposit);
    }

    public String showTotal() {
        return "El total de la cuenta es" + this.total;
    }

    @Override
    public String getName() {
        return name;
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
