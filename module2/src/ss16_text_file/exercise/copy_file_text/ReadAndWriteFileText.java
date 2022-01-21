package ss16_text_file.exercise.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileText {
    public static List<String> readFileText(String SourcePath) {
        List<String> stringList = new ArrayList<>();
        try {
            File file = new File(SourcePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static void writeFileText(String SourcePath, String TargetPath) {
        List<String> stringList = readFileText(SourcePath);
        int sumLength=0;
        try {
            File fileTextTarget = new File(TargetPath);
            FileWriter fileWriter = new FileWriter(fileTextTarget);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(String s:stringList){
                bufferedWriter.write(s);
                sumLength+=s.length();
                bufferedWriter.newLine();
            }
            bufferedWriter.write("total char : "+sumLength);
            bufferedWriter.close();
            if (!fileTextTarget.exists()) {
                throw new IOException("file is not exist!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
