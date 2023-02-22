public class Air extends Vehicles {
    private Integer numOfEngine;
    private boolean verticaTakeoff;

    public Air(Integer tonnage, Integer passengers, String name, Integer numOfEngine, boolean verticaTakeoff) {
        super(tonnage, passengers, name);
        this.numOfEngine = numOfEngine;
        this.verticaTakeoff = verticaTakeoff;
    }
    public Integer getNumOfEngine() {
        return numOfEngine;
    }
    public boolean isVerticaTakeoff() {
        return verticaTakeoff;
    }
    @Override
    public String toString() {
        return super.toString() + ", количество двигателей: " +  numOfEngine + ", возможность вертикльного взлета: " + verticaTakeoff;
    }
    
}
