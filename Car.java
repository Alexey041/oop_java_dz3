public class Car extends Ground {
    private Integer numOfWheels;
    private Integer fuel;

    public Car(Integer tonnage, Integer passengers, String name, String type, Integer numOfWheels) {
        super(tonnage, passengers, name, type);
        this.numOfWheels = numOfWheels;
    }
    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }
    public Integer getNumOfWheels() {
        return numOfWheels;
    }
    public Integer getFuel() {
        return fuel;
    }
    @Override
    public String toString() {
        return super.toString() + ", количество колес: " + numOfWheels + ", количество топлива: " + fuel;
    }

    
}