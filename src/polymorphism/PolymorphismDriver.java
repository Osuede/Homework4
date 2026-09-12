package polymorphism;

public class PolymorphismDriver {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Black Pearl", "1985");
        ships[1] = new CruiseShip("Ocean Majesty", "2010", 3000);
        ships[2] = new CargoShip("Cargo Titan", "2005", 85000);

        for (Ship ship : ships) {
            ship.print();
        }
    }
}
