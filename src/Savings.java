public class Savings implements User {

    static int id = 0;
    private final String name;
    public double total;
    private final double initial;

    double interest;

    double profit;

    public Savings(String name, double deposit, double interest) {
        id++;

        this.name = name;
        this.initial = deposit;
        this.total =  this.initial;
        this.interest = interest;
    }

    public void profit(double interest, int ticks) {
        this.profit += this.total*interest*ticks;
    }

    @Override
    public void deposit(double deposit) {
        this.total += deposit;
    }

    @Override
    public String getName() {
        return name;
    }
    public String showTotal() {
        return  "El total es: " + this.total;
    }

    public String showProfit() {
        return "Las ganancias brutas han sido: " + profit;
    }

    public static int getId() {
        return id;
    }

    public void withdraw(double unDeposit) {
        System.out.println("This type of account does not support this");
    }
}
