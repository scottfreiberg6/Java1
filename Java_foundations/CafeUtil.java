import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(){
        int sum = 0;
        for(int i = 0; i < 11; i++){
        sum += i;
        }
        return sum;}
double getOrderTotal(double[] lineItems){
        double total = 0;
        for(int i = 0; i < lineItems.length; i++){
        total += lineItems[i];
        }
        return total;}
void displayMenu(ArrayList<String> menu){
        for(int i = 0; i < menu.size(); i++){
        System.out.println(menu.get(i));
}}
void addCustomer(ArrayList<String> customers){
        System.out.println("Enter customer name: ");
        String name = System.console().readLine();
        System.out.println("There are \n"+customers.size() + "people ahead of you:");
        customers.add(name);
        for(int i = 0; i < customers.size(); i++){
        System.out.println(customers.get(i));
}}
}

