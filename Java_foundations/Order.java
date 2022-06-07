import java.util.ArrayList;
public class Order {
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;
    private Order() {
        this.items = new ArrayList<Item>();
    }

}
