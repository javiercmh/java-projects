import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner keyboard = new Scanner(System.in);
        
        String firstName;
        char middleInitial;
        String city;
        int age;
        char sex;
        float salary;

        System.out.print("What's your first name? --> ");
        firstName = keyboard.nextLine();
        System.out.print("What's your middle initial? --> ");
        middleInitial = keyboard.next().charAt(0);
        System.out.print("How old are you? --> ");
        age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("What city are you from? --> ");
        city = keyboard.nextLine();
        System.out.print("Type in your sex (M/F/D) --> ");
        sex = keyboard.next().charAt(0);
        System.out.print("Type in your hourly wage (€) --> ");
        salary = keyboard.nextFloat();

        System.out.println("Hello, " + firstName + " " + middleInitial + ". from "
                + city + "!");
        System.out.println("Your sex is '" + sex + "', your're "
                + age + " years old and you earn €" + salary + " per hour. Nice!");

        keyboard.close();   // not necessary, just doing it to avoid the red underline
    }
}
