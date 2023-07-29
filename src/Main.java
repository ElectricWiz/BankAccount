// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var newUser1 = UserFactory.construct("standard", "Daniel Bazan", 500);

        newUser1.withdraw(150.0);
        System.out.println(newUser1.showTotal());

        var newUser2 = UserFactory.construct("savings", "Ana", 25000);

        newUser2.withdraw(300);
    }
}