/* Program that converts between temperatures in Celsius and Fahrenheit */

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        char option;
        double temperature;

        System.out.println("Welcome to this temperature conversion program.");
        System.out.println("--------------------------------------------\n");

        while(true) {
            System.out.println("Select one of the following options:" +
                "\n- Enter 'F' to convert from Fahrenheit to Celcius" +
                "\n- Enter 'C' to convert from Celcius to Fahrenheit" +
                "\n- Enter any other thing to exit.");
            System.out.print("Your option? --> ");
            option = keyboard.next().toUpperCase().charAt(0);
            keyboard.nextLine();
            
            if(option == 'F') {
                System.out.println("Now enter the temperature in Fahrenheit (e.g. 51).");
                System.out.print("Temperature to convert --> ");
                temperature = keyboard.nextDouble();
                System.out.println();
                System.out.println(temperature + "°F is " + (temperature-32)*5/9 + "°C");

            } else if(option == 'C') {
                System.out.println("Now enter the temperature in Celsius (e.g. 23).");
                System.out.print("Temperature to convert --> ");
                temperature = keyboard.nextDouble();
                System.out.println();
                System.out.println(temperature + "°C is " + (temperature*9/5+32) + "°F");

            } else break;

            System.out.println();
        }
        
        System.out.println("\nThank you very much for using this program!");

        keyboard.close();
    }
}
