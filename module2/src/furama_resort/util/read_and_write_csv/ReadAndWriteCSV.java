package furama_resort.util.read_and_write_csv;

import furama_resort.model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCSV {
    public List<String> readFileCSV(String path) {
        List<String> list = new ArrayList<>();

        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }

            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void writeFileCSV(String path, List<String> list, boolean append) {

        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String s : list) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public <T> List<String> changeToStringList(List<T> list) {
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Person) {
                stringList.add(((Person) list.get(i)).getInfor());
            }
            if (list.get(i) instanceof Facility) {
                stringList.add(((Facility) list.get(i)).getInformation());
            }
            if (list.get(i) instanceof Booking) {
                stringList.add(((Booking) list.get(i)).getString());
            }
            if (list.get(i) instanceof Contract) {
                stringList.add(((Contract) list.get(i)).getString());
            }
        }
        return stringList;
    }

    public <T> List<T> changeStringListToGenericList(List<String> list, T t) {
        List<T> listT = new ArrayList<>();
        String[] arr;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            if (t instanceof House) {
                House house = new House(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], Integer.parseInt(arr[6]), 0);
                listT.add((T) house);
            }
            if (t instanceof Room) {
                Room room = new Room(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], 0);
                listT.add((T) room);
            }
            if (t instanceof Villa) {
                Villa villa = new Villa(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], Integer.parseInt(arr[6]), Double.parseDouble(arr[7]), 0);
                listT.add((T) villa);
            }

            if (t instanceof Booking) {
                Booking booking = new Booking(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
                listT.add((T) booking);
            }
            if (t instanceof Contract) {
                Contract contract = new Contract(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4]);
                listT.add((T) contract);
            }
            if (t instanceof Employee) {
                Employee employee = new Employee(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], Integer.parseInt(arr[9]));
                listT.add((T) employee);
            }
            if (t instanceof Customer) {
                Customer customer = new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[6], arr[7]);
                listT.add((T) customer);
            }
        }
        return listT;
    }

    public static void main(String[] args) {
        ReadAndWriteCSV readAndWriteCSV = new ReadAndWriteCSV();
        List<String> string = readAndWriteCSV.readFileCSV(CSVPath.CUSTOMER);
        List<Customer> customer = readAndWriteCSV.changeStringListToGenericList(string,new Customer());
        for(Customer list:customer){
            System.out.println(list);
        }

    }



}
