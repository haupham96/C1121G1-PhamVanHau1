package furama_resort.service.impl;

import furama_resort.model.Facility;
import furama_resort.model.House;
import furama_resort.model.Room;
import furama_resort.model.Villa;
import furama_resort.service.FacilityService;
import furama_resort.util.exception.user_input_exception.UserInputException;
import furama_resort.util.read_and_write_csv.CSVPath;
import furama_resort.util.read_and_write_csv.ReadAndWriteCSV;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    ReadAndWriteCSV readAndWriteCSV = new ReadAndWriteCSV();
    Scanner scanner = new Scanner(System.in);
    static Map<Facility, Integer> facilityList = new LinkedHashMap<>();

    @Override
    public void addVilla() {
        List<String> stringList = readAndWriteCSV.readFileCSV(CSVPath.VILLA);

        System.out.println("Input name of Villa ");
        String nameOfService = scanner.nextLine();

        System.out.println("input time for rent ");
        String typeOfRentByTime = scanner.nextLine();

        System.out.println("room standard ?");
        String standard = scanner.nextLine();

        do {
            try {
                System.out.println("Input Area of Villa");
                double area = Double.parseDouble(scanner.nextLine());

                System.out.println("Input price of Villa");
                int price = Integer.parseInt(scanner.nextLine());

                System.out.println("Input numbers of person ");
                int numberOfPerson = Integer.parseInt(scanner.nextLine());

                System.out.println("floor ?");
                int floor = Integer.parseInt(scanner.nextLine());

                System.out.println("Swimming pool area ?");
                double swimmingPoolArea = Double.parseDouble(scanner.nextLine());

                Villa villa = new Villa(nameOfService,area,price,numberOfPerson,typeOfRentByTime,standard,floor,swimmingPoolArea,0);
                facilityList.put(villa, villa.getMaintenance());

                stringList.add(villa.getInformation());

                break;

            } catch (Exception e) {
                UserInputException inputException = new UserInputException("invalid input");
                inputException.printStackTrace();
            }
        } while (true);

        readAndWriteCSV.writeFileCSV(CSVPath.VILLA, stringList, false);

    }

    @Override
    public void addHouse() {
        List<String> list = readAndWriteCSV.readFileCSV(CSVPath.HOUSE);

        System.out.println("Input name of House ");
        String nameOfService = scanner.nextLine();

        System.out.println("input time for rent ");
        String typeOfRentByTime = scanner.nextLine();

        System.out.println("room standard ?");
        String standard = scanner.nextLine();

        do {
            try {
                System.out.println("Input Area of House");
                double area = Double.parseDouble(scanner.nextLine());
                System.out.println("Input price of House");
                int price = Integer.parseInt(scanner.nextLine());
                System.out.println("Input numbers of person ");
                int numberOfPerson = Integer.parseInt(scanner.nextLine());
                System.out.println("floor ?");
                int floor = Integer.parseInt(scanner.nextLine());

                House house = new House(nameOfService, area, price, numberOfPerson, typeOfRentByTime, standard, floor,0);
                facilityList.put(house, house.getMaintenance());

                list.add(house.getInformation());
                break;

            } catch (Exception e) {
                UserInputException inputException = new UserInputException("invalid input");
                inputException.printStackTrace();
            }
        } while (true);

        readAndWriteCSV.writeFileCSV(CSVPath.HOUSE, list, false);

    }

    @Override
    public void addRoom() {

        List<String> list = readAndWriteCSV.readFileCSV(CSVPath.ROOM);

        System.out.println("Input name of Room ");
        String nameOfService = scanner.nextLine();

        System.out.println("input time for rent ");
        String typeOfRentByTime = scanner.nextLine();

        System.out.println("name of Free service ? ");
        String freeService = scanner.nextLine();

        do {
            try {
                System.out.println("Input Area of Room");
                double area = Double.parseDouble(scanner.nextLine());

                System.out.println("Input price of Room ");
                int price = Integer.parseInt(scanner.nextLine());

                System.out.println("Input numbers of person ");
                int numberOfPerson = Integer.parseInt(scanner.nextLine());

                Room room = new Room(nameOfService, area, price, numberOfPerson, typeOfRentByTime, freeService,0);
                facilityList.put(room, room.getMaintenance());

                list.add(room.getInformation());
                break;
            } catch (Exception e) {
                UserInputException userInputException = new UserInputException("invalid input");
                userInputException.printStackTrace();
            }
        } while (true);

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
            House house = new House(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], Integer.parseInt(arr[6]),Integer.parseInt(arr[7]));
            map.put(house, house.getMaintenance());
        }

        List<String> listRoom = readAndWriteCSV.readFileCSV(CSVPath.ROOM);
        for (int i = 0; i < listRoom.size(); i++) {
            arr = listRoom.get(i).split(",");
            Room room = new Room(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5],Integer.parseInt(arr[6]));
            map.put(room, room.getMaintenance());
        }

        List<String> listVilla = readAndWriteCSV.readFileCSV(CSVPath.VILLA);
        for (int i = 0; i < listVilla.size(); i++) {
            arr = listVilla.get(i).split(",");
            Villa villa = new Villa(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], Integer.parseInt(arr[6]), Double.parseDouble(arr[7]),Integer.parseInt(arr[8]));
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
            House house = new House(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], Integer.parseInt(arr[6]),Integer.parseInt(arr[7]));
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
            Room room = new Room(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5],Integer.parseInt(arr[6]));
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
            Villa villa = new Villa(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5],Integer.parseInt(arr[6]), Double.parseDouble(arr[7]),Integer.parseInt(arr[8]));
            map.put(villa, villa.getMaintenance());
        }
        return map;
    }
}
