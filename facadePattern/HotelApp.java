package facadePattern;

import java.util.*;

public class HotelApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        FrontDesk frontDesk = new FrontDesk();

        System.out.println("Welcome to Simplified Hotel Management System!\n");

        while (true) {
            System.out.println("Available Services:");
            System.out.println("1.) Valet Service");
            System.out.println("2.) Housekeeping Service");
            System.out.println("3.) Cart Service");

            System.out.print("\nSelect a service you want: ");
            Integer userChoice = userInput.nextInt();
            userInput.nextLine();

            switch (userChoice) {
                case 1: // for Valet Service.
                    System.out.println("\n======== VALET SERVICE ========");
                    System.out.print("\nEnter your vehicle plate number: ");
                    String plateNumber = userInput.nextLine();
                    HotelService valetService = new Valet(plateNumber); // store userInput plateNumber.
                    System.out.println();
                    frontDesk.assignService(valetService);
                    break;

                case 2: // for Housekeeping Service.
                    System.out.println("\n======== HOUSEKEEPING SERVICE ========");
                    System.out.print("\nEnter your room number: ");
                    String roomNumber = userInput.nextLine();
                    HotelService houseKeepingService = new HouseKeeping(roomNumber); // store userInput roomNumber.
                    System.out.println();
                    frontDesk.assignService(houseKeepingService);
                    break;

                case 3: // for Cart Service.
                    try {
                        System.out.println("\n======== CART SERVICE ========");
                        System.out.print("\nEnter number of carts you want to request: ");
                        Integer numberOfCarts = userInput.nextInt();
                        userInput.nextLine();
                        HotelService cartService = new Cart(numberOfCarts); // store userInput numberOfCarts.
                        System.out.println();
                        frontDesk.assignService(cartService);
                    } catch (InputMismatchException e){ // to catch invalid input.
                        System.out.println("\nInvalid number of carts. Please try again.");
                        userInput.nextLine(); // to proceed next scanner.
                    }
                    break;

                default: // for invalid service.
                    System.out.println("\nInvalid service! Please try again.");
            }

            // to prompt user if she/he want to continue the program.
            System.out.print("\n\nWould you like to choose another service? (Y/N): ");
            String userChoiceB = userInput.nextLine();
            System.out.println();
            if (!userChoiceB.toLowerCase().equals("y")) {
                System.out.println("Program Terminated!");
                System.out.println("Programmed by: Ronan D. Soriano | 3 BSCS - 1");
                break;
            }
        }
        userInput.close();
    }
}
