package furama_resort.service.impl;

import furama_resort.model.Booking;
import furama_resort.service.PromotionService;

import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class PromotionServiceImpl implements PromotionService {
    Scanner scanner = new Scanner(System.in);
    TreeSet<Booking> bookingList1 = new TreeSet<>();

    @Override
    public void displayCustomerUseService() {

        System.out.println("Enter Year");
        String inputYear = scanner.nextLine();

        for (Booking list : bookingList1) {
            String[] day = list.getDayStart().split("/");
            String year = day[2];
            if (year.equals(inputYear)) {
                System.out.println(list);
            } else {
                System.out.println("Invalid Year");
                break;
            }
        }
    }

    @Override
    public void displayCustomerGetVoucher() {
        int voucher10 = 3;
        int voucher20 = 2;
        int voucher50 = 1;

        Stack<Booking> bookingStack = new Stack<>();
        bookingStack.addAll(bookingList1);

        System.out.println("Enter Month");
        String inputMonth = scanner.nextLine();
        String[] day ;
        String month ;
        Booking temp ;

            while (!bookingStack.isEmpty()){
                temp = bookingStack.pop();
                day = temp.getDayStart().split("/");
                month = day[1];
                if(inputMonth.equals(month)){
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
