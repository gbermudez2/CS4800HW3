package HW1.Polymorphism;

public class CruiseShip extends Ship{
    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt, int maxPassengers){
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers(){
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers){
        this.maxPassengers = maxPassengers;
    }

    public void print(){
        System.out.println("Cruise ship name: "+getName()+"\nMaximum occupancy: "+getMaxPassengers());
    }
}
