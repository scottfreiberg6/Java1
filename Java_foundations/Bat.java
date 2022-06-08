import java.util.ArrayList;
class Bat extends Mammal
{
    public Bat(String name, int energy)
    {
        super(name, energy);
    }
    //Methods
    public void fly()
    {
        if(this.energy>=0)
        {
            this.energy-=50;

        }
    
        {
            System.out.println("Not enough energy");
        }
    }
    public void eatHumans()
    {
        if(this.energy>=0)
        {
            this.energy+=25;
        }
    
        {
            System.out.println("is satisifed");
        }
    }
    public void attackTown()
    {
        if(this.energy>=0)
        {
            this.energy-=100;
        }
    
        {
            System.out.println("Not enough energy");
        }
    }
}

