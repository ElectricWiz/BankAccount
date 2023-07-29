final class UserFactory {
    private UserFactory() {};

    static User construct(String type, String name, double deposit) {
        User newUser = new User(" ", 0.0);

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
        }

        return newUser;
    }
}
