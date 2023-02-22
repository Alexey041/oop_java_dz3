public class Helicopter extends Air {
    private String fuel;

    public Helicopter(Integer tonnage, Integer passengers, String name, Integer numOfEngine, boolean verticaTakeoff) {
        super(tonnage, passengers, name, numOfEngine, verticaTakeoff);
    }    
    public String getFuel() {
        return fuel;
    }
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
    public String toString() {
        return super.toString() + ", количество топлива: " + fuel;
    }

}
