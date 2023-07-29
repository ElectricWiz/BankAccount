public interface User {
    public static int id = 0;


    public static int getId(){
        return id;
    };
    public void deposit(double deposit);
    public String showTotal();
    public String getName();
    public void withdraw(double unDeposit);

}
