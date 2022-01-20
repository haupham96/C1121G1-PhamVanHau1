package ss16_text_file.practice.file_max_value_and_write_to_file;

import java.util.List;

public class FindMaxValue {
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
        List<Integer> numbers = readAndWriteFile.readFile("D:\\CodeGym\\C1121G1-PhamVanHau1\\module2\\src\\ss16_text_file\\practice\\file_max_value_and_write_to_file\\Numbers");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\CodeGym\\C1121G1-PhamVanHau1\\module2\\src\\ss16_text_file\\practice\\file_max_value_and_write_to_file\\Result",maxValue);

    }
}
