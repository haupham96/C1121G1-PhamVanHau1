package ss16_text_file.exercise.read_file_csv;

import java.util.List;

public class Main {
    final static String PATH = "src/ss16_text_file/exercise/read_file_csv/Country.csv";
    public static void main(String[] args) {
        ReadAndWriteFileCSV readAndWriteFileCSV = new ReadAndWriteFileCSV();
        List<String> coutry = readAndWriteFileCSV.readFileCSV(PATH);
        for(String list:coutry){
            System.out.println(list);
        }
    }
}
