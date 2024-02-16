package HW1.Polymorphism;

public class CargoShip extends Ship{
    private int tonnage;

    public CargoShip(String name, String yearBuilt, int tonnage){
        super(name, yearBuilt);
        this.tonnage = tonnage;
    }

    public int getTonnage(){
        return tonnage;
    }

    public void setTonnage(int tonnage){
        this.tonnage = tonnage;
    }

    public void print(){
        System.out.println("Cargo ship name: "+getName()+"\nTonnage capacity: "+getTonnage());
    }
}
