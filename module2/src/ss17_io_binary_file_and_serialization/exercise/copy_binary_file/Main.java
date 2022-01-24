package ss17_io_binary_file_and_serialization.exercise.copy_binary_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    final static String SOURCE_PATH = "src/ss17_io_binary_file_and_serialization/exercise/copy_binary_file/Source.csv";
    final static String TARGET_PATH = "src/ss17_io_binary_file_and_serialization/exercise/copy_binary_file/Target.csv";

    public static void copyBinaryFile(File Source, File Target) throws IOException {
        Files.copy(Source.toPath(), Target.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void main(String[] args) {
        File source = new File(SOURCE_PATH);
        File target = new File(TARGET_PATH);
        try {
            if (!(source.exists())) {
                System.out.println("File source does not exist");
                throw new FileNotFoundException();
            } else if (!(target.exists())) {
                System.out.println("File target does not exist");
                throw new FileNotFoundException();
            } else {
                copyBinaryFile(source, target);
                System.out.println("Copy Successfully!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
