package furama_resort.service.impl;

import furama_resort.model.Facility;
import furama_resort.model.House;
import furama_resort.model.Room;
import furama_resort.model.Villa;
import furama_resort.service.FacilityService;
import furama_resort.util.exception.user_input_exception.UserInputException;
import furama_resort.util.read_and_write_csv.CSVPath;
import furama_resort.util.read_and_write_csv.ReadAndWriteCSV;
import furama_resort.util.read_and_write_csv.Regex;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    ReadAndWriteCSV readAndWriteCSV = new ReadAndWriteCSV();
    Scanner scanner = new Scanner(System.in);
    static Map<Facility, Integer> facilityList = new LinkedHashMap<>();

    @Override
    public void addVilla() {
        List<String> stringList = readAndWriteCSV.readFileCSV(CSVPath.VILLA);
        String nameOfService;
        String typeOfRentByTime;
        String standard;
        String area;
        while (true) {
            System.out.println("Input name of Villa (SVVL-XXXX) ");
            nameOfService = scanner.nextLine();
            if (Regex.validateNameOfVilla(nameOfService)) {
                break;
            } else {
                System.out.println("Invalid Input , Please try Again \n ( EXAMPLE : SVVL-0000)");
            }
        }
        while (true) {
            System.out.println("input time for rent ");
            typeOfRentByTime = scanner.nextLine();
            if (Regex.validateStringName(typeOfRentByTime)) {
                break;
            } else {
                System.out.println("Invalid Input , Please try Again \n ( EXAMPLE : Aaaaaaaa)");
            }
        }

        while (true) {
            System.out.println("room standard ?");
            standard = scanner.nextLine();
            if (Regex.validateStringName(standard)) {
                break;
            } else {
                System.out.println("Invalid Input , Please try Again \n ( EXAMPLE : Aaaaaaaa)");
            }
        }

        while (true) {
            System.out.println("Input Area of Villa");
            area = scanner.nextLine();
            try {
                if (Regex.validateDouble(area)) {
                    break;
                } else {
                    throw new UserInputException("Invalid Number , Please try Again \n ( EXAMPLE : 31)");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        String price;
        while (true) {
            System.out.println("Input price of Villa");
            price = scanner.nextLine();
            if (Regex.validateMoney(price)) {
                break;
            } else {
                System.out.println("Invalid Input , Please try Again \n ( EXAMPLE : 1000000)");
            }
        }

        String numberOfPerson;
        while (true) {
            System.out.println("Input numbers of person ");
            numberOfPerson = scanner.nextLine();
            if (Regex.validateNumberPerson(numberOfPerson)) {
                break;
            } else {
                System.out.println("Invalid Input , Please try Again \n ( EXAMPLE : 1-19)");
            }
        }

        String floor;
        while (true) {
            System.out.println("floor ?");
            floor = scanner.nextLine();
            if (Regex.validateFloor(floor)) {
                break;
            } else {
                System.out.println("Invalid Input , Please try Again \n ( EXAMPLE : 1 )");
            }
        }

        String swimmingPoolArea;
        while (true) {
            System.out.println("Swimming pool area ?");
            swimmingPoolArea = scanner.nextLine();
            try {
                if (Regex.validateDouble(swimmingPoolArea)) {
                    break;
                } else {
                    throw new UserInputException("Invalid Input , Please try Again \n ( EXAMPLE : 31 )");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


        Villa villa = new Villa(nameOfService, Double.parseDouble(area), Integer.parseInt(price), Integer.parseInt(numberOfPerson), typeOfRentByTime, standard, Integer.parseInt(floor), Double.parseDouble(swimmingPoolArea), 0);
        facilityList.put(villa, villa.getMaintenance());

        stringList.add(villa.getInformation());

        readAndWriteCSV.writeFileCSV(CSVPath.VILLA, stringList, false);

    }

    @Override
    public void addHouse() {
        List<String> list = readAndWriteCSV.readFileCSV(CSVPath.HOUSE);

        String nameOfService;
        while (true) {
            System.out.println("Input name of House ");
            nameOfService = scanner.nextLine();
            if (Regex.validateNameOfHouse(nameOfService)) {
                break;
            } else {
                System.out.println("Invalid Input , Please try Again \n ( EXAMPLE : SVHO-0000 )");
            }
        }

        String typeOfRentByTime;
        while (true) {
            System.out.println("input time for rent ");
            typeOfRentByTime = scanner.nextLine();
            if (Regex.validateStringName(typeOfRentByTime)) {
                break;
            } else {
                System.out.println("Invalid Input , Please try Again \n ( EXAMPLE : Aaaaa )");
            }
        }

        String standard;
        while (true) {
            System.out.println("room standard ?");
            standard = scanner.nextLine();
            if (Regex.validateStringName(standard)) {
                break;
            } else {
                System.out.println("Invalid Input , Please try Again \n ( EXAMPLE : Aaaaa )");
            }
        }

        System.out.println("Input Area of House");
        String area = Regex.regexData(scanner.nextLine(), Regex.AREA, "Invalid Input , Please try Again \n ( EXAMPLE : > 30 )");
        System.out.println("Input price of House");
        String price = Regex.regexData(scanner.nextLine(), Regex.MONEY, "Invalid Input , Please try Again \n ( EXAMPLE : 10000 )");
        System.out.println("Input numbers of person ");
        String numberOfPerson = Regex.regexData(scanner.nextLine(), Regex.NUMBER_OF_PERSON, "Invalid Input , Please try Again \n ( EXAMPLE : 1-19 )");
        System.out.println("floor ?");
        String floor = Regex.regexData(scanner.nextLine(), Regex.FLOOR, "Invalid Input , Please try Again \n ( EXAMPLE : 1 )");

        House house = new House(nameOfService, Double.parseDouble(area), Integer.parseInt(price), Integer.parseInt(numberOfPerson), typeOfRentByTime, standard, Integer.parseInt(floor), 0);
        facilityList.put(house, house.getMaintenance());

        list.add(house.getInformation());


        readAndWriteCSV.writeFileCSV(CSVPath.HOUSE, list, false);

    }

    @Override
    public void addRoom() {

        List<String> list = readAndWriteCSV.readFileCSV(CSVPath.ROOM);

        System.out.println("Input name of Room ");
        String nameOfService = Regex.regexData(scanner.nextLine(), Regex.NAME_OF_ROOM, "Invalid Input , Please try Again \n ( EXAMPLE : SVRO-0000 )");

        System.out.println("input time for rent ");
        String typeOfRentByTime = Regex.regexData(scanner.nextLine(), Regex.TYPE_OF_SERVICE, "Invalid Input , Please try Again \n ( EXAMPLE : Aaaaa )");

        System.out.println("name of Free service ? ");
        String freeService = Regex.regexData(scanner.nextLine(), Regex.TYPE_OF_SERVICE, "Invalid Input , Please try Again \n ( EXAMPLE : Aaaaa )");

        System.out.println("Input Area of Room");
        String area = Regex.regexData(scanner.nextLine(),Regex.AREA,"Invalid Input , Please try Again \n ( EXAMPLE : >30 )");

        System.out.println("Input price of Room ");
        String price = Regex.regexData(scanner.nextLine(),Regex.MONEY,"Invalid Input , Please try Again \n ( EXAMPLE : 1000 )");

        System.out.println("Input numbers of person ");
        String numberOfPerson = Regex.regexData(scanner.nextLine(),Regex.NUMBER_OF_PERSON,"Invalid Input , Please try Again \n ( EXAMPLE : 1-19 )");

        Room room = new Room(nameOfService, Double.parseDouble(area), Integer.parseInt(price), Integer.parseInt(numberOfPerson), typeOfRentByTime, freeService, 0);
        facilityList.put(room, room.getMaintenance());

        list.add(room.getInformation());

        readAndWriteCSV.writeFileCSV(CSVPath.ROOM, list, false);

    }

    @Override
    public void display() {

        Map<Facility, Integer> facility = readHouseRoomVillaCSV();

        for (Facility key : facility.keySet()) {
            System.out.println(key.toString());
        }
    }

    @Override
    public void displayMaintenance() {

        Map<Facility, Integer> facility = readHouseRoomVillaCSV();

        for (Facility key : facility.keySet()) {
            System.out.println("Name Of Service : " + key.getNameOfService() + " , Booking times : " + facility.get(key));
        }
    }

    public Map<Facility, Integer> readHouseRoomVillaCSV() {

        Map<Facility, Integer> map = new LinkedHashMap<>();
        List<String> listHouse = readAndWriteCSV.readFileCSV(CSVPath.HOUSE);
        String[] arr;

        for (int i = 0; i < listHouse.size(); i++) {
            arr = listHouse.get(i).split(",");
            House house = new House(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], Integer.parseInt(arr[6]), Integer.parseInt(arr[7]));
            map.put(house, house.getMaintenance());
        }

        List<String> listRoom = readAndWriteCSV.readFileCSV(CSVPath.ROOM);
        for (int i = 0; i < listRoom.size(); i++) {
            arr = listRoom.get(i).split(",");
            Room room = new Room(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], Integer.parseInt(arr[6]));
            map.put(room, room.getMaintenance());
        }

        List<String> listVilla = readAndWriteCSV.readFileCSV(CSVPath.VILLA);
        for (int i = 0; i < listVilla.size(); i++) {
            arr = listVilla.get(i).split(",");
            Villa villa = new Villa(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], Integer.parseInt(arr[6]), Double.parseDouble(arr[7]), Integer.parseInt(arr[8]));
            map.put(villa, villa.getMaintenance());
        }

        return map;
    }

    public Map<Facility, Integer> readHouse() {
        Map<Facility, Integer> map = new LinkedHashMap<>();
        List<String> listHouse = readAndWriteCSV.readFileCSV(CSVPath.HOUSE);
        String[] arr;
        for (int i = 0; i < listHouse.size(); i++) {
            arr = listHouse.get(i).split(",");
            House house = new House(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], Integer.parseInt(arr[6]), Integer.parseInt(arr[7]));
            map.put(house, house.getMaintenance());
        }
        return map;
    }

    public Map<Facility, Integer> readRoom() {
        Map<Facility, Integer> map = new LinkedHashMap<>();
        List<String> listRoom = readAndWriteCSV.readFileCSV(CSVPath.ROOM);
        String[] arr;
        for (int i = 0; i < listRoom.size(); i++) {
            arr = listRoom.get(i).split(",");
            Room room = new Room(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], Integer.parseInt(arr[6]));
            map.put(room, room.getMaintenance());
        }
        return map;
    }

    public Map<Facility, Integer> readVilla() {
        Map<Facility, Integer> map = new LinkedHashMap<>();
        List<String> listVilla = readAndWriteCSV.readFileCSV(CSVPath.VILLA);
        String[] arr;
        for (int i = 0; i < listVilla.size(); i++) {
            arr = listVilla.get(i).split(",");
            Villa villa = new Villa(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], Integer.parseInt(arr[6]), Double.parseDouble(arr[7]), Integer.parseInt(arr[8]));
            map.put(villa, villa.getMaintenance());
        }
        return map;
    }
}
