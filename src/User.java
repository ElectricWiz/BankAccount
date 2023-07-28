import Interfaces.*;

public class User implements IsConstructable {
    public int id = 0;
    private String name;
    public double total;
    private boolean inDebt;

    @Override
     public void create() {
        id++;
        System.out.println("Creado Usuario # " + id);
    }
}
