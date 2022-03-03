package views;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.Scanner;

public class MainView {
    private static final Logger logger = LogManager.getLogger(MainView.class);
    public static void displayMainView() {
        System.out.println("-------------------RESTAURANT-----------------------");
        System.out.println("1. Menu Management");
        System.out.println("2. Bill Management");
        System.out.println("3. Exit");
        System.out.println("Choice: ");
        int choice;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        MenuView.displayMain();
                        break;
                    case 2:
                        BillView.displayMain();
                        break;
                    case 3:
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
