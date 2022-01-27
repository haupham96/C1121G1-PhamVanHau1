package furama_resort.model;

public class House extends Facility {
    private String standard;
    private int floor;
    private Contract contract = null;

    public House() {
    }

    public House(String nameOfService, double area, int priceOfService, int numberOfPerson, String typeOfRentByTime, String roomStandard, int floor, Contract contract) {
        super(nameOfService, area, priceOfService, numberOfPerson, typeOfRentByTime);
        this.standard = roomStandard;
        this.floor = floor;
        this.contract = contract;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return super.toString() + " , " +
                "roomStandard : " + standard +
                ", floor : " + floor;
    }

    @Override
    public String getInformation() {
        return super.getInformation() + "," + this.standard + "," + this.floor;
    }
}
