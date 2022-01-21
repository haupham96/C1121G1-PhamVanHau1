package ss6_inheritance.codegym_managerment.controller;

import ss6_inheritance.codegym_managerment.service.impl.StudentServiceImpl;

import java.util.Scanner;

public class MainMenu {
    public  void showMainMenu(){
        System.out.println("Đây là hàm main");
        StudentServiceImpl studentService = new StudentServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int chooseMenu;
        boolean flag = true;
        do {
            System.out.println("1.\tadd\n" +
                    "2.\tdisplay\n" +
                    "3.\tedit \n" +
                    "4.\tdelete\n" +
                    "5.\tsearch\n" +
                    "6.\tExit\n");
            chooseMenu = scanner.nextInt();
            switch (chooseMenu) {
                case 1:
                    System.out.println("Chức năng add");
                    studentService.add();
                    break;
                case 2:
                    studentService.display();
                    System.out.println("display");
                    break;
                case 3:
                    System.out.println("edit");
                    studentService.edit();
                    break;
                case 4:
                    System.out.println("delete");
                    studentService.delete();
                    break;
                case 5:
                    System.out.println("search");
                    studentService.seachByName();
                    break;
                case 6:
                    flag = false;
            }
        } while (flag);
    }
}
