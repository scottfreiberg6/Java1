package Barrista_challenge;
import java.util.ArrayList;


public class Test_Order {
    public static void main(String[] args) {

//Create Items
Items item1= new Items("coffee", 5.00);
Items item2=new Items("capuccino",7.00);
Items item3=new Items ("latte",8.00);
Items item4=new Items("mocha",6.50);

 // Create an ArrayList of Orders
ArrayList<Orders> orders = new ArrayList<Orders>();

Orders order1=new Orders();
order1.setName("Cindhuri");
order1.addItem(item1);
double total=order1.getTotal();
order1.setReady(true);
Orders order2=new Orders();
order2.setName("Sam");
order2.addItem(item2);
total=order2.getTotal();
order2.addItem(item3);
total=order2.getTotal();
Orders order3=new Orders();
order3.setName("Jimmy");
order3.addItem(item2);;
total=order3.getTotal();
order3.setReady(true);
Orders order4=new Orders();
order4.setName("Noah");
order4.addItem(item3);
total=order4.getTotal();
System.out.println(total);
    }
}
