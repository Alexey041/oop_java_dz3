public class Ship extends Marine {
    private Integer numOfEngine;
    private String typeEngine;
    private Integer fuel;

    public Ship(Integer tonnage, Integer passengers, String name, String type, String typeEngine, Integer numOfEngine) {
        super(tonnage, passengers, name, type);
        this.typeEngine = typeEngine;
        this.numOfEngine = numOfEngine;
    }
    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }
    public Integer getNumOfEngine() {
        return numOfEngine;
    }
    public String getTypeEngine() {
        return typeEngine;
    }
    public Integer getFuel() {
        return fuel;
    }
    @Override
    public String toString() {
        return super.toString() + ", число двигателей: " + numOfEngine + ", тип двигателя(ей): " + typeEngine + ", количество топлива: " + fuel;
    }
    
}
