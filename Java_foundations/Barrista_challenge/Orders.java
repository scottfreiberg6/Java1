package Barrista_challenge;
import java.util.ArrayList;


public class Orders {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Items> items; // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Orders() {
        this.name = "Guest";
        this.items = new ArrayList<Items>();
    }
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Orders(String name) {
        this.name = name;
        this.items = new ArrayList<Items>();
    }
    // ORDER METHODS
    public void addItem(Items item) {
        this.items.add(item);
    }
    public String getStatusMessage() {
        if (this.ready) {
            return "Your order is ready!";
        } else {
            return "Your order is not ready yet.";
        }
    }
    public double getTotal() {
        double total = 0;
        for (Items item : this.items) {
            total += item.getPrice();
        }
        return total;
    }
    public void display() {
        System.out.println("Order for " + this.name);
        System.out.println("Items:");
    }
    	// Most of your code will go here, 
    	// so implement the getters and setters first!
        // GETTERS & SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean getReady() {
        return ready;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public ArrayList<Items> getItems() {
        return items;
    }
    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }
}

