final class UserFactory {
    public UserFactory() {};

    static User construct(String type, String name, double deposit) {
        switch(type) {
            case "standard":
                return new BankAccount(name, deposit);
            case "savings":
                return new Savings(name, deposit, 0.05);
            case "investment":
                return new Investment(name, deposit);
            default:
                System.out.println("das wort ist nicht richtig");
                System.out.println("wir haben ein default konto fuer dich gemacht");
                return new BankAccount("Heinz", 0.01);
        }
    }
}
