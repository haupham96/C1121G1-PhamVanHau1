package furama_resort.service.impl;

import furama_resort.model.Facility;
import furama_resort.model.House;
import furama_resort.model.Room;
import furama_resort.model.Villa;
import furama_resort.service.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    Scanner scanner = new Scanner(System.in);
    static Map<Facility, Integer> facilityList = new LinkedHashMap<>();

    static {
        Villa villa = new Villa("Villa", 20.0d, 5000000, 4, "3 Day", "Vip", 2,  30);
        House house = new House("House", 10.0d, 3000000, 2, "3 Day", "Vip",4);
        Room room = new Room("Room", 7.5d, 1500000, 2, "2 Day", "Free Breakfast");
        facilityList.put(villa, 0);
        facilityList.put(house, 0);
        facilityList.put(room, 0);
    }


    @Override
    public void addVilla() {
        System.out.println("Input name of Villa ");
        String nameOfService = scanner.nextLine();
        System.out.println("Input Area of Villa");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Input price of Villa");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Input numbers of person ");
        int numberOfPerson = Integer.parseInt(scanner.nextLine());
        System.out.println("input time for rent ");
        String typeOfRentByTime = scanner.nextLine();
        System.out.println("room standard ?");
        String standard = scanner.nextLine();
        System.out.println("floor ?");
        int floor = Integer.parseInt(scanner.nextLine());
        System.out.println("Swimming pool area ?");
        double swimmingPoolArea = Double.parseDouble(scanner.nextLine());

        Villa villa = new Villa(nameOfService, area, price, numberOfPerson, typeOfRentByTime, standard, floor, swimmingPoolArea);
        facilityList.put(villa, 0);
    }

    @Override
    public void addHouse() {
        System.out.println("Input name of House ");
        String nameOfService = scanner.nextLine();
        System.out.println("Input Area of House");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Input price of House");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Input numbers of person ");
        int numberOfPerson = Integer.parseInt(scanner.nextLine());
        System.out.println("input time for rent ");
        String typeOfRentByTime = scanner.nextLine();
        System.out.println("room standard ?");
        String standard = scanner.nextLine();
        System.out.println("floor ?");
        int floor = Integer.parseInt(scanner.nextLine());

        House house = new House(nameOfService, area, price, numberOfPerson, typeOfRentByTime, standard, floor);
        facilityList.put(house, 0);
    }

    @Override
    public void addRoom() {
        System.out.println("Input Number of Room ");
        String nameOfService = scanner.nextLine();

        System.out.println("Input Area of Room");
        double area = Double.parseDouble(scanner.nextLine());

        System.out.println("Input price of Room ");
        int price = Integer.parseInt(scanner.nextLine());

        System.out.println("Input numbers of person ");
        int numberOfPerson = Integer.parseInt(scanner.nextLine());

        System.out.println("input time for rent ");
        String typeOfRentByTime = scanner.nextLine();

        System.out.println("name of Free service ? ");
        String freeService = scanner.nextLine();

        Room room = new Room(nameOfService, area, price, numberOfPerson, typeOfRentByTime, freeService);
        facilityList.put(room, 0);
    }

    @Override
    public void display() {
        for (Facility key : facilityList.keySet()) {
            System.out.println(key.toString());
        }
    }

    @Override
    public void displayMaintenance() {
        for (Facility key : facilityList.keySet()) {
            System.out.println("Name Of Service : " + key.getNameOfService() + " , Booking times : " + facilityList.get(key));
        }
    }
}
