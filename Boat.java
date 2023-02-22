public class Boat extends Marine {
    private boolean engineAvailability;
    
    public Boat(Integer tonnage, Integer passengers, String name, String type, boolean engineAvailability) {
        super(tonnage, passengers, name, type);
        this.engineAvailability = engineAvailability;
    }
    public boolean isEngineAvailability() {
        return engineAvailability;
    }
    @Override
    public String toString() {
        return super.toString() + ", наличие двигателя: " + engineAvailability;
    }
    
}
