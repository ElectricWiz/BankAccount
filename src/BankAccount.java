public class BankAccount extends User implements IsDepositable, IsWithdrawable {

    private BankAccount(String name, double deposit) {
        super(name, deposit);
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
