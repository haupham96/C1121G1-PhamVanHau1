package furama_resort.model;

import furama_resort.util.read_and_write_csv.CSVPath;

import java.util.*;

public class Villa extends Facility {
    private double swimmingPoolArea;
    private String roomStandard;
    private int floor;

    public Villa() {
    }

    public Villa(String nameOfService, double area, int priceOfService, int numberOfPerson, String typeOfRentByTime, String roomStandard, int floor, double swimmingPoolArea, int maintenace) {
        super(nameOfService, area, priceOfService, numberOfPerson, typeOfRentByTime, maintenace);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.floor = floor;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public void usingTimes(String nameOfService) {
        Map<Facility, Integer> villa = facilityService.readVilla();
        Set<Facility> villaSet;
        villaSet = villa.keySet();
        List<Facility> villaList = new ArrayList<>();
        villaList.addAll(villaSet);
        boolean check = false;

        List<String> temp = new ArrayList<>();
        for (Facility list : villaList) {
            if (list.getNameOfService().equals(nameOfService)) {
                list.setMaintenance(list.getMaintenance() + 1);
                check = true;
            }
            temp.add(list.getInformation());
        }
        if (check) {
            readAndWriteCSV.writeFileCSV(CSVPath.VILLA, temp, false);
        }

    }

    @Override
    public String toString() {
        return super.toString() + " , " +
                "roomStandard : " + roomStandard +
                ", floor : " + floor +
                ", swimmingPoolArea=" + swimmingPoolArea;
    }

    @Override
    public String getInformation() {
        return super.getInformation() + "," + this.roomStandard + "," + this.floor + "," + this.swimmingPoolArea + "," + this.getMaintenance();
    }
}
