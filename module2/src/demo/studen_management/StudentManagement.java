package demo.studen_management;

import java.util.Scanner;

public class StudentManagement {
    Scanner scanner = new Scanner(System.in);
    Student[] studentList = new Student[10];

    public void add() {
        System.out.println("Enter ID :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Address :");
        String address = scanner.nextLine();
        System.out.println("Enter DoB :");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Enter Class Name :");
        String className = scanner.nextLine();
        System.out.println("Enter School :");
        String school = scanner.nextLine();
        System.out.println("Enter Point :");
        int point = scanner.nextInt();
        Student student = new Student(id, name, address, dateOfBirth, className, school, point);
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = student;
                break;
            }
        }
    }
    public void display(){
        for(int i=0;i< studentList.length;i++){
            if(studentList[i]!=null){
                System.out.println(studentList[i].toString());
            }else {
                break;
            }
        }
    }
    public void delete(){
        System.out.println("Enter ID to delete :");
       int idDelete = scanner.nextInt();
       for(int i=0;i< studentList.length;i++){
           if(studentList[i].id==idDelete){

           }
       }
    }


}
