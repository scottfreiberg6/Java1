import java.util.ArrayList;

public class Mammal {
    //Member Variables
    protected String name;
    protected int energy;
//Constructor
    public Mammal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }
    //Methods
    public void displayEnergy() {
        System.out.println(this.name + " has " + this.energy + " energy.");
    }
    //Static Variables
    public static int NumberofMammals = 0;
    public static int TotalEnergy = 0;
    public static ArrayList<String> Transactions = new ArrayList<String>();



}
