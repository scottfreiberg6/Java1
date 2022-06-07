import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        //Create an Item
Item item1= new Item("coffee", 5.00);
Item item2=new Item("capuccino",7.00);
Item item3=new Item ("latte",8.00);
Item item4=new Item("mocha",6.50);
        // Create an ArrayList of Orders
        ArrayList<Order> orders = new ArrayList<Order>();
        Order order1=new Order();
        order1.name= "Cindhuri";
        order1.items.add(item1);
        order1.total+=item1.price;
        order1.ready=true;
        Order order2=new Order();
        order2.name="Sam";
        order2.items.add(item2);
        order2.total+=item2.price;
        order2.items.add(item2);
        order2.total+=item2.price;
        Order order3=new Order();
        order3.name="Jimmy";
        order3.items.add(item2);
        order3.total+=item2.price;
        order3.ready=true;
        Order order4=new Order();
        order4.name="Noah";
        order4.items.add(item3);
        order4.total+=item3.price;
        // Menu items
        ArrayList<Item> menuItems = new ArrayList<>();
        // Order variables -- order1, order2 etc. are the names of the orders in the array list
        // Add items to the menu
        menuItems.add(item1);
        menuItems.add(item2);
        menuItems.add(item3);
        menuItems.add(item4);
        // Application Simulations

        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("Items: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.printf("Items: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        System.out.printf("Items: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
