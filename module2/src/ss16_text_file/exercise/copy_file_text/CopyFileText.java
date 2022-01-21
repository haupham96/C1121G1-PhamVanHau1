package ss16_text_file.exercise.copy_file_text;



import static ss16_text_file.exercise.copy_file_text.ReadAndWriteFileText.writeFileText;

public class CopyFileText {
    final static String SOURCE_PATH = "src/ss16_text_file/exercise/copy_file_text/Source.txt";
    final static String TARGET_PATH = "src/ss16_text_file/exercise/copy_file_text/Target.txt";
    public static void main(String[] args) {
        writeFileText(SOURCE_PATH,TARGET_PATH);
        System.out.println("done!");
    }
}
