package furama_resort.model;

public class Room extends Facility {
    private String nameOfFreeService ;

    public Room() {
    }

    public Room(String nameOfService, double area, int priceOfService, int numberOfPerson, String typeOfRentByTime, String nameOfFreeService) {
        super(nameOfService, area, priceOfService, numberOfPerson, typeOfRentByTime);
        this.nameOfFreeService = nameOfFreeService;
    }

    public String getNameOfFreeService() {
        return nameOfFreeService;
    }

    public void setNameOfFreeService(String nameOfFreeService) {
        this.nameOfFreeService = nameOfFreeService;
    }

    @Override
    public String toString() {
        return super.toString() +" , "+
                "nameOfFreeService : " + nameOfFreeService;
    }

    @Override
    public String getInformation(){
        return super.getInformation()+","+this.nameOfFreeService;
    }
}
