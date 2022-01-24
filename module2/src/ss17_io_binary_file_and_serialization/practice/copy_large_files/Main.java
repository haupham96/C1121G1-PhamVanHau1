package ss17_io_binary_file_and_serialization.practice.copy_large_files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0){
                os.write(buffer,0,length);

            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Typing Source File Path ...");
        String sourcePath = "src/ss17_io_binary_file_and_serialization/exercise/copy_large_files/Source.txt";
        System.out.println("Typing Destination File Path ...");
        String destPath = "src/ss17_io_binary_file_and_serialization/exercise/copy_large_files/Destination.txt";

        File fileSource = new File(sourcePath);
        File fileDest = new File(destPath);

        try{
            copyFileUsingJava7Files(fileSource,fileDest);
            System.out.println("Copy complete");
        }catch(IOException ioe){
            System.out.println("Can't copy that file");
            System.out.println(ioe.getMessage());
        }
    }
}
