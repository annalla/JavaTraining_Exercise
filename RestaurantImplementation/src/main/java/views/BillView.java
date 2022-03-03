package views;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class BillView {
    private static final Logger logger = LogManager.getLogger(BillView.class);
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMain(){
        System.out.println("---------Bill Management-------------------------");
        System.out.println("1. Add a bill");
        System.out.println("2. Delete a bill");
        System.out.println("3. Update a bill");
        System.out.println("4. Display a bill");
        System.out.println("5. Display bill's list");
        System.out.println("6. Back");
        System.out.println("7. Exit");
        System.out.println("Choice: ");
        int choice;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:

                        break;
                    case 2:
                        ;
                    case 6:
                        MainView.displayMainView();
                    case 7:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong choice!!Select again!!");
                }

            } catch (RuntimeException e) {
                logger.fatal("Wrong input choice - " + e);
                scanner.nextLine();
                System.out.println("Select again:");
            }
        }
    }
}
