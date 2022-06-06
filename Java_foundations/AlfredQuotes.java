import java.util.Date;
public class AlfredQuotes {

        public static void main(String[]args){
            System.out.println("Hello, Alfred!");
            System.out.println("Today is " + new Date());
        }
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        System.out.println("Hello, " + name + "!");
        return "place holder for guest greeting return string";
    }
    
    public String dateAnnouncement() {
        System.out.println("date"+ new Date());
        return "place holder for date announcement return string";
    }
    
    public String respondBeforeAlexis(String conversation) {
        System.out.println("You said: " + conversation);
        
        return "for snarky response return string";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}
