package HW1.Polymorphism;

public class Ship {
    private String name;
    private String yearBuilt;

    public Ship(String name, String yearBuilt){
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getYear(){
        return yearBuilt;
    }

    public void setYear(String yearBuilt){
        this.yearBuilt = yearBuilt;
    }

    public void print(){
        System.out.println("Ship name: "+name+"\nYear built: "+yearBuilt);
    }
}
