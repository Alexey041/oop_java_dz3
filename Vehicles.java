public class Vehicles {
    private Integer tonnage;
    private Integer passengers;
    private String name;

    public Vehicles(Integer tonnage, Integer passengers, String name) {
        this.tonnage = tonnage;
        this.passengers = passengers;
        this.name = name;
    }
    public Integer getTonnage() {
        return tonnage;
    }
    public String getName() {
        return name;
    }
    public Integer getPassengers() {
        return passengers;
    }
    public String toString() {
        return "Название: " + name + ", число пассажиров: " + passengers + ", грузоподъемность: " + tonnage;
    }
}
