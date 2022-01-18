package ss12_java_collection_framework.exercise.queue;

import ss1_introduction_to_java.practise.SystemTime;

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        int customerID = 1;
        int queueNumber = 1;
        Deque<Integer> customers = new LinkedList<>();
        Deque<Integer> queue = new LinkedList<>();
        int choice;
        do {
            System.out.println();
            System.out.println("WELCOME TO BIGCITY-Bank");
            System.out.println(" ");
            System.out.println("0. Exit");
            System.out.println("1. Add customer to queue");
            System.out.println("2. Serve at first queue");
            System.out.println("3. Serve at last queue");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your choices ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 0:
                    System.err.println("GOODBYE!");
                    System.exit(0);
                case 1:
                    System.out.println("Enter your Customer ID :");
                    customerID = Integer.parseInt(scanner.nextLine());
                    customers.add(customerID);
                    queueNumber= (int) (Math.random()*100);
                    System.out.println("Your Queue numbers is : "+queueNumber);
                    queue.add(queueNumber);
                    break;
                case 2:
                    if(queue.isEmpty()){
                        System.out.println("0");
                    } else {
                        System.out.println("Serving customersID : "+customers.removeFirst()+" at order : "+queue.removeFirst());
                    }
                    break;

                case 3:
                    if(queue.isEmpty()){
                        System.out.println("0");
                    } else {
                        System.out.println("Serving customersID : " + customers.removeLast() + " at order : " + queue.removeLast());
                    }
                    break;
                default:
                    System.out.println("INVALID NUMBER");
            }
        } while (choice != 0);

    }
}
