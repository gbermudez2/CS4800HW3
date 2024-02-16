package HW1.Polymorphism;

public class Driver {
    public static void main(String[] args){
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("Basic", "2002");
        ships[1] = new CruiseShip("Cruise", "2022", 5000);
        ships[2] = new CargoShip("Cargo", "1990", 10000);

        for (Ship i : ships) {
            i.print();
            System.out.println();
        }
    }
}
