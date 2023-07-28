public class BankAccount extends User implements IsDepositable, IsWithdrawable {

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
