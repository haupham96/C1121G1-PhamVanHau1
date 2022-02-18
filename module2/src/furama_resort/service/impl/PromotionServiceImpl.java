package furama_resort.service.impl;

import furama_resort.model.Booking;
import furama_resort.service.PromotionService;
import furama_resort.util.read_and_write_csv.CSVPath;
import furama_resort.util.read_and_write_csv.ReadAndWriteCSV;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class PromotionServiceImpl implements PromotionService {
    ReadAndWriteCSV readAndWriteCSV = new ReadAndWriteCSV();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayCustomerUseService() {
        List<String> list = readAndWriteCSV.readFileCSV(CSVPath.BOOKING);

        List<Booking> bookingList = readAndWriteCSV.changeStringListToGenericList(list, new Booking());

        System.out.println("Enter Year");
        String inputYear = scanner.nextLine();
        String year;
        String[] day;
        boolean check = false;
        for (Booking ls : bookingList) {
            day = ls.getDayStart().split("/");
            year = day[2];
            if (year.equals(inputYear)) {
                System.out.println(ls);
                check = true;
            }
        }
        if (!check) {
            System.out.println("invalid input");
        }
    }

    @Override
    public void displayCustomerGetVoucher() {
        List<String> list = readAndWriteCSV.readFileCSV(CSVPath.BOOKING);
        List<Booking> bookingList = readAndWriteCSV.changeStringListToGenericList(list, new Booking());

        int voucher10 = 3;
        int voucher20 = 2;
        int voucher50 = 1;

        Stack<Booking> bookingStack = new Stack<>();
        bookingStack.addAll(bookingList);

        System.out.println("Enter Month");
        String inputMonth = scanner.nextLine();
        String[] day;
        String month;
        Booking temp;

        while (!bookingStack.isEmpty()) {
            temp = bookingStack.pop();
            day = temp.getDayStart().split("/");
            month = day[1];
            if (inputMonth.equals(month)) {
                if (voucher10 > 0) {
                    voucher10 = voucher10 - 1;
                    System.out.println("Customers : " + temp.getCustomerCode() + " got Voucher 10% ");
                } else {
                    if (voucher20 > 0) {
                        voucher20 = voucher20 - 1;
                        System.out.println("Customers : " + temp.getCustomerCode() + " got Voucher 20% ");
                    } else {
                        if (voucher50 > 0) {
                            voucher50 = voucher50 - 1;
                            System.out.println("Customers : " + temp.getCustomerCode() + " got Voucher 50% ");
                        }

                    }
                }
            }
        }


    }
}
