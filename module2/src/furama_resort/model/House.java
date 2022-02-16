package furama_resort.model;

import furama_resort.util.read_and_write_csv.CSVPath;

import java.util.*;

public class House extends Facility {
    private String standard;
    private int floor;

    public House() {
    }

    public House(String nameOfService, double area, int priceOfService, int numberOfPerson, String typeOfRentByTime, String roomStandard, int floor,int maintenance) {
        super(nameOfService, area, priceOfService, numberOfPerson, typeOfRentByTime,maintenance);
        this.standard = roomStandard;
        this.floor = floor;
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

    @Override
    public void usingTimes(String nameOfService){
        Map<Facility, Integer> house = facilityService.readHouse();
        Set<Facility> houseSet = new HashSet<>();
        houseSet = house.keySet();
        List<Facility> houseList = new ArrayList<>();
        houseList.addAll(houseSet);
        boolean check = false;

        List<String> temp = new ArrayList<>();
        for (Facility list : houseList) {
            if (list.getNameOfService().equals(nameOfService)) {
                list.setMaintenance(list.getMaintenance() + 1);
                check = true;
            }
            temp.add(list.getInformation());
        }
        if(check){
            readAndWriteCSV.writeFileCSV(CSVPath.HOUSE, temp, false);
        }

    }


    @Override
    public String toString() {
        return super.toString() + " , " +
                "roomStandard : " + standard +
                ", floor : " + floor;
    }

    @Override
    public String getInformation() {
        return super.getInformation() + "," + this.standard + "," + this.floor+ "," +this.getMaintenance();
    }
}
