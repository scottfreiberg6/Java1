import java.util.ArrayList;
class Gorollia extends Mammal
{
    public Gorollia(String name, int energy)
    {
        super(name, energy);
    }
    //Methods
    public void throwSomething(Mammal target)
    {
        if(this.energy>=0)
        {
            this.energy-=5;
            Transactions.add(this.name + " threw something at " + target.name);
        }
    
        {
            System.out.println("Not enough energy");
        }
    }

    public void eatBannas (){
        if (this.energy>0)
        {
            this.energy+=10;
           System.out.println(this.name + " ate bannas");
        }

        System.out.println("Gorollia has been satsified");
    }

    public void climb(){
        if(this.energy>=0)
        {
            this.energy-=5;
            System.out.println(this.name + " climbered a tree ");
        }
    
        
        System.out.println("Not enough energy");
        
    }
}