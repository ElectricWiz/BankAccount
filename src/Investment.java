public class Investment implements User {

    static int id = 0;
    static int ticks;
    private final String name;
    public double total;

    public Investment(String name, double deposit) {
        id++;

        this.name = name;
        this.total = deposit;
    }

    public void deposit(double deposit) {
        this.total += deposit;
    }

    private double profit(double interest, int ticks) {
        return this.total*interest*ticks;
    }

    public String showTotal() {
        return "El total sera: " + this.total + profit(0.05, ticks);
    }

    public void withdraw(double unDeposit) {
        this.total -= unDeposit;
    }

    @Override
    public String getName() {
        return name;
    }

    public static int getId() {
        return id;
    }
}
