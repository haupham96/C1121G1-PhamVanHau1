package ss16_text_file.practice.file_max_value_and_write_to_file;

import java.util.List;

public class FindMaxValue {
    public static final String RS_PATH = "src/ss16_text_file/practice/file_max_value_and_write_to_file/Result";
    public static final String NUM_PATH = "src/ss16_text_file/practice/file_max_value_and_write_to_file/Numbers";
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile(NUM_PATH);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(RS_PATH,maxValue);

    }
}
