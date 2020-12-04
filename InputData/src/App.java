import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner keyboard = new Scanner(System.in);

        String firstName;
        String city;
        int age;
        char sex;

        System.out.print("What's your first name? --> ");
        firstName = keyboard.nextLine();
        System.out.print("How old are you? --> ");
        age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("What city are you from? --> ");
        city = keyboard.nextLine();
        System.out.print("Type in your sex (M/F/D) --> ");
        sex = keyboard.next().charAt(0);

        System.out.println("Hello, " + firstName + " from "
                + city + "!");
        System.out.println("Your sex is '" + sex + "', and your're "
                + age + " years old.");
        keyboard.close();
    }
}
