public class User {
    static int id = 0;
    private final String name;
    public double total;

    public User(String name, double deposit) {
        id++;

        this.name = name;
        this.total = deposit;
    }
}
