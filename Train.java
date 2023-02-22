public class Train extends Ground  {
    private Integer numOfCarsTrain;

    public Train(Integer tonnage, Integer passengers, String name, String type) {
        super(tonnage, passengers, name, type);
    }
    public Integer getNumOfCarsTrain() {
        return numOfCarsTrain;
    }
    public void setNumOfCarsTrain(Integer numOfCarsTrain) {
        this.numOfCarsTrain = numOfCarsTrain;
    }
    @Override
    public String toString() {
        return super.toString() + ", количество вагонов: " + numOfCarsTrain;
    }
    
}
