public class BankAccount implements User {

    static int id = 0;
    private final String name;
    public double total;


    public BankAccount(String name, double deposit) {
        id++;

        this.name = name;
        this.total = deposit;
    }

    public String showTotal() {
        return "El total de la cuenta es: " + this.total;
    }

    @Override
    public String getName() {
        return name;
    }

    public static int getId() {
        return id;
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
