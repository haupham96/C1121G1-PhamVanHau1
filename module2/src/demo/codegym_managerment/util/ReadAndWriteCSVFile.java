package demo.codegym_managerment.util;

import ss6_inheritance.codegym_managerment.model.Student;
import ss6_inheritance.codegym_managerment.model.Teacher;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCSVFile {
    // ghi đối ttuongj student vào file
    public static void writeStudentToCSV(List<Student> studentList, String pathFile,boolean append) {
        File file = new File(pathFile);
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student: studentList) {
                bufferedWriter.write(student.getInfoToWriteCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }
    public static void writeStudentToCSV1(List<Student> studentList, String pathFile,boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Student student: studentList) {
            stringList.add(student.getInfoToWriteCSV());
        }
        writeStringListToCSV(stringList,pathFile,append);
    }
    //
    public static void writeTeacherToCSV(List<Teacher> teacherList, String pathFile, boolean append) {
        // chuyển listTeach => listString = >gọi hàm
        List<String> stringList = new ArrayList<>();
        for (Teacher teach: teacherList) {
            stringList.add(teach.getInfoToWriteCSV());
        }
        writeStringListToCSV(stringList,pathFile,append);
    }
    //
    private static void writeStringListToCSV(List<String> stringList, String pathFile, boolean append) {
        File file = new File(pathFile);
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String strings: stringList) {
                bufferedWriter.write(strings);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }

    // đọc file csv => List<Student>
    public static List<Student> readStudentFromCSVFile(String pathFile) {
        List<Student> studentList = new ArrayList<>();
        File file = new File(pathFile);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");//chuyển đổi từ string => mảng ( để dễ xử lý dữ liệu)
                Student student = new Student(Integer.parseInt(array[0]), array[1], array[2],
                        array[3], array[4], Integer.parseInt(array[5]));
                studentList.add(student);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
        return studentList;
    }
}
