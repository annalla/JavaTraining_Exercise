package views;

import controllers.MenuManagement;
import models.MenuType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MenuView {

    private static Scanner scanner = new Scanner(System.in);

    public static MenuManagement menuManagement = new MenuManagement();

    private static final Logger logger = LogManager.getLogger(MenuView.class);

    private static HashMap<Integer, MenuType> menuSelectMenuType = new HashMap<>();

    private static void setUpMenuSelectMenuType() {
        int index = 1;
        for (Map.Entry<MenuType, List<MenuType>> entry : MenuManagement.menu.entrySet()) {
            for (MenuType type : entry.getValue()) {
                menuSelectMenuType.put(index, type);
                index++;
            }
        }
    }

    public static void addAMenu() {

        System.out.println("1. Add a menu----------------");
        System.out.println("Input name:");
        String name = scanner.nextLine();
        System.out.println("Input description:");
        String description = scanner.nextLine();
        System.out.println("Input image url:");
        String image = scanner.nextLine();
        System.out.println("Input price:");
        Double price = scanner.nextDouble();

        boolean flag = true;
        int index = 1;

        for (Map.Entry<MenuType, List<MenuType>> entry : MenuManagement.menu.entrySet()) {
            System.out.println(entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println("\t" + index + ". " + entry.getValue().get(i));
                index++;
            }
        }

        int select;

        System.out.println("Choose type of menu:");
        while (flag) {
            try {
                select = scanner.nextInt();
                if (menuSelectMenuType.containsKey(select)) {
                    menuManagement.createMenu(menuSelectMenuType.get(select), name, description, image, price);
                    flag = false;
                } else {
                    System.out.println("Wrong choice.Select again:");
                }
            } catch (RuntimeException e) {
                logger.fatal("Wrong input choice - " + e);
                scanner.nextLine();
                System.out.println("Select again:");
            }
        }

    }

    public static void deleteAMenu() {

    }

    public static void updateAMenu() {

    }

    public static void displayAMenu() {

    }

    public static void displayMenuList() {
        System.out.println("5. Display a menu list------------");
        for (int i = 0; i < MenuManagement.menuList.size(); i++) {
            System.out.println(menuManagement.displayMenu(i));
        }
    }

    public static void exportAMenuCSV() {

    }

    public static void importAMenuCSV() {

    }

    public static void displayMain() {

        MenuManagement.setUpMenu();
        setUpMenuSelectMenuType();
        int choice;
        boolean flag = true;

        while (flag) {

        System.out.println("---------Menu Management---------------------");
        System.out.println("1. Add a menu");
        System.out.println("2. Delete a menu");
        System.out.println("3. Update a menu");
        System.out.println("4. Display a menu");
        System.out.println("5. Display menu's List");
        System.out.println("6. Export a menu to CSV file");
        System.out.println("7. Import a menu from CSV file");
        System.out.println("8. Back");
        System.out.println("9. Exit");
        System.out.println("Choice: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        addAMenu();
                        break;
                    case 2:
                        deleteAMenu();
                        break;
                    case 3:
                        updateAMenu();
                        break;
                    case 4:
                        displayAMenu();
                        break;
                    case 5:
                        displayMenuList();
                        break;
                    case 6:
                        exportAMenuCSV();
                        break;
                    case 7:
                        importAMenuCSV();
                        break;
                    case 8:
                        MainView.displayMainView();
                        break;
                    case 9:
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
