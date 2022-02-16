package furama_resort.model;

import furama_resort.service.impl.FacilityServiceImpl;
import furama_resort.util.read_and_write_csv.CSVPath;
import furama_resort.util.read_and_write_csv.ReadAndWriteCSV;

import java.util.*;

public abstract class Facility {
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    ReadAndWriteCSV readAndWriteCSV = new ReadAndWriteCSV();

    private String nameOfService;
    private double area;
    private int priceOfService;
    private int numberOfPerson;
    private String typeOfRentByTime;
    private int maintenance = 0;



    public Facility() {
    }

    public Facility(String nameOfService, double area, int priceOfService, int numberOfPerson, String typeOfRentByTime,int maintenance) {
        this.nameOfService = nameOfService;
        this.area = area;
        this.priceOfService = priceOfService;
        this.numberOfPerson = numberOfPerson;
        this.typeOfRentByTime = typeOfRentByTime;
        this.maintenance = maintenance;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(int maintenance) {
        this.maintenance = maintenance;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getPriceOfService() {
        return priceOfService;
    }

    public void setPriceOfService(int priceOfService) {
        this.priceOfService = priceOfService;
    }

    public int getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public String getTypeOfRentByTime() {
        return typeOfRentByTime;
    }

    public void setTypeOfRentByTime(String typeOfRentByTime) {
        this.typeOfRentByTime = typeOfRentByTime;
    }

    public abstract void usingTimes(String nameOfService);


    @Override
    public String toString() {
        return
                "nameOfService : " + nameOfService +
                        ", area : " + area +
                        ", priceOfService : " + priceOfService +
                        ", numberOfPerson : " + numberOfPerson +
                        ", typeOfRentByTime : " + typeOfRentByTime;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Double.compare(facility.area, area) == 0 && priceOfService == facility.priceOfService && numberOfPerson == facility.numberOfPerson && Objects.equals(nameOfService, facility.nameOfService) && Objects.equals(typeOfRentByTime, facility.typeOfRentByTime);
    }

    @Override
    public int hashCode() {
        return 11;
    }

    public String getInformation() {
        return this.nameOfService + "," + this.area + "," + this.priceOfService + "," + this.numberOfPerson + "," + this.typeOfRentByTime;
    }
}
