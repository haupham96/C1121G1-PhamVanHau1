package furama_resort.util.read_and_write_csv;

import furama_resort.model.Booking;
import furama_resort.model.Contract;
import furama_resort.model.Facility;
import furama_resort.model.Person;

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

    public void writeFileCSV(String path, List<String> list,boolean append) {

        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file,append);
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
            if(list.get(i) instanceof Person){
                stringList.add(((Person) list.get(i)).getInfor());
            }
            if(list.get(i) instanceof Facility){
                stringList.add(((Facility) list.get(i)).getInformation());
            }
            if (list.get(i) instanceof Booking){
                stringList.add(((Booking) list.get(i)).getString());
            }
            if (list.get(i) instanceof Contract) {
                stringList.add(((Contract) list.get(i)).getString());
            }
        }
        return stringList;
    }


}
