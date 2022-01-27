package furama_resort.model;

public class Villa extends House {
    private double swimmingPoolArea;

    public Villa() {
    }

    public Villa(String nameOfService, double area, int priceOfService, int numberOfPerson, String typeOfRentByTime, String roomStandard, int floor,Contract contract, double swimmingPoolArea) {
        super(nameOfService, area, priceOfService, numberOfPerson, typeOfRentByTime, roomStandard, floor,contract);
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    @Override
    public String toString() {
        return super.toString() + " , " +
                "swimmingPoolArea : " + swimmingPoolArea;
    }

    @Override
    public String getInformation() {
        return super.getInformation() + "," + this.swimmingPoolArea;
    }
}
