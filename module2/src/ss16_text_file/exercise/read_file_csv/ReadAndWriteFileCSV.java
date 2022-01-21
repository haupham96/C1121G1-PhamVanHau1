package ss16_text_file.exercise.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileCSV {
    public void writeFileCSV(String path){
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(path,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            if(!file.exists()){
                throw new FileNotFoundException("File not found");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<String> readFileCSV(String path){
        String[] country;
        List<String> listCountry = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ="";
            while((line= bufferedReader.readLine())!=null){
                country=line.split(",");
                listCountry.add(country[2]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listCountry;
    }
}
