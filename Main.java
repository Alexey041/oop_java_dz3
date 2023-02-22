/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Ship titanic = new Ship(52000, 2439, "Титаник", "Пассажирский пароход", "Паровой", 2);
        titanic.setFuel(2563);
        System.out.println(titanic);
    }
}