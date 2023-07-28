public class Investment extends User implements IsDepositable,
        IsProfitable, IsConstructable {
    private Investment(String name, double deposit) {
        super(name, deposit);
    }

    public void deposit(double deposit) {
        this.total += deposit;
    }

    public void profit(double interest, int ticks) {
        this.total += this.total*interest*ticks;
    }

    public User create(String name, double deposit) {
        System.out.println("Creando nueva cuenta de inversion");

        return new Investment(name, deposit);
    }


}
