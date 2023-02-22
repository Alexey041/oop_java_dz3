public class Airplane extends Air {
    private String fuel;

    public Airplane(Integer tonnage, Integer passengers, String name, Integer numOfEngine, boolean verticaTakeoff) {
        super(tonnage, passengers, name, numOfEngine, verticaTakeoff);
    }
    public String getFuel() {
        return fuel;
    }
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
    @Override
    public String toString() {
        return super.toString() + ", количество топлива: " + fuel;
    }
    
}
