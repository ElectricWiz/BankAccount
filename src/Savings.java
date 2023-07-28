public class Savings extends User implements IsProfitable, IsDepositable {

    double interest;

    double profit;

    private Savings(String name, double deposit, double interest) {
        super(name, deposit);
        this.interest = interest;
    }

    static User create(String name, double deposit, double interest) {
        return new Savings(name, deposit, interest);
    }

    public void profit(double interest, int ticks) {
        this.total += this.total*interest*ticks;
    }

    @Override
    public void deposit(double deposit) {
        this.total += deposit;
    }
}
