public class Savings implements User, IsProfitable, IsDepositable {

    static int id = 0;
    private final String name;
    public double total;
    private final double initial;

    double interest;

    double profit;

    private Savings(String name, double deposit, double interest) {
        this.name = name;
        this.initial = deposit;
        this.total =  this.initial;
        this.interest = interest;
    }

    static User create(String name, double deposit, double interest) {
        id++;
        System.out.println("Creando cuenta de ahorro");

        return new Savings(name, deposit, interest);
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

    public String showROI() {
        return "Tu %ROI total es: " + this.profit/this.initial;
    }
}
