/* Program that converts between miles and kilometers. */

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        char option;
        float distance;

        System.out.println("Welcome to this distance conversion program.");
        System.out.println("--------------------------------------------\n");

        while(true) {
            System.out.println("Select one of the following options:" +
                "\n- Enter 'k' to convert from kilometers to miles" +
                "\n- Enter 'm' to convert from miles to kilometers" +
                "\n- Enter any other character to exit.");
            System.out.print("Your option? --> ");
            option = keyboard.next().toLowerCase().charAt(0);
            keyboard.nextLine();
            
            if(option == 'k') {
                System.out.println("Now enter the distance in kilometers (e.g. 42).");
                System.out.print("Distance to convert --> ");
                distance = keyboard.nextFloat();
                System.out.println();
                System.out.println(distance + " km equals " + distance/1.609 + " miles");

            } else if(option == 'm') {
                System.out.println("Now enter the distance in miles (e.g. 23).");
                System.out.print("Distance to convert --> ");
                distance = keyboard.nextFloat();
                System.out.println();
                System.out.println(distance + " miles equals " + distance*1.609 + " km");
                
            } else break;

            System.out.println();
        }
        
        System.out.println("\nThank you very much for using this program!");

        keyboard.close();
    }
}
