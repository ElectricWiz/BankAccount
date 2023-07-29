final class UserFactory {
    private UserFactory() {};

    static User construct(String type, String name, double deposit) {
        User newUser;

        switch(type) {
            case "standard":
                newUser = BankAccount.create(name, deposit);
                break;
            case "savings":
                newUser = Savings.create(name, deposit, 0.05);
                break;
            case "investment":
                newUser = Investment.create(name, deposit);
                break;
            default:
                System.out.println("das wort ist nicht richtig");
                System.out.println("wir haben ein default konto fuer dich gemacht");
                newUser = BankAccount.create("Heinz", 0.01);
        }

        return newUser;
    }
}
