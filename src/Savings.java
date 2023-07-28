import Interfaces.*;

public class Savings extends User implements IsProfitable, IsDepositable {

    @Override
    public double growMoney() {
        return 0.0;
    }

    @Override
    public void deposit() {

    }
}
