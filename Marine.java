public class Marine extends Vehicles {
    private String type;

    public Marine(Integer tonnage, Integer passengers, String name, String type) {
        super(tonnage, passengers, name);
        this.type = type;
    }
    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return super.toString() + ", тип: " + type;
    }
    
}
