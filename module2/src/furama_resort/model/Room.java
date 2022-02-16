package furama_resort.model;

import furama_resort.util.read_and_write_csv.CSVPath;

import java.util.*;

public class Room extends Facility {
    private String nameOfFreeService;

    public Room() {
    }

    public Room(String nameOfService, double area, int priceOfService, int numberOfPerson, String typeOfRentByTime, String nameOfFreeService,int maintenance) {
        super(nameOfService, area, priceOfService, numberOfPerson, typeOfRentByTime,maintenance);
        this.nameOfFreeService = nameOfFreeService;
    }

    public String getNameOfFreeService() {
        return nameOfFreeService;
    }

    public void setNameOfFreeService(String nameOfFreeService) {
        this.nameOfFreeService = nameOfFreeService;
    }

    @Override
    public void usingTimes(String nameOfService) {
        Map<Facility, Integer> room = facilityService.readRoom();
        Set<Facility> roomSet ;
        roomSet = room.keySet();
        List<Facility> roomList = new ArrayList<>();
        roomList.addAll(roomSet);
        boolean check = false;
        List<String> temp = new ArrayList<>();
        for (Facility list : roomList) {
            if (list.getNameOfService().equals(nameOfService)) {
                list.setMaintenance(list.getMaintenance() + 1);
                check = true;
            }
            temp.add(list.getInformation());
        }
        if(check){
            readAndWriteCSV.writeFileCSV(CSVPath.ROOM, temp, false);
        }

    }

    @Override
    public String toString() {
        return super.toString() + " , " +
                "nameOfFreeService : " + nameOfFreeService;
    }

    @Override
    public String getInformation() {
        return super.getInformation() + "," + this.nameOfFreeService + "," + this.getMaintenance();
    }
}
