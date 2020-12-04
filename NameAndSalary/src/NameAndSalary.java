public class NameAndSalary {

    public static void main(String[] args) {
        // declare and initialize variables
        String firstName = "Javier";
        char middleInitial = 'A';
        String lastName = "Carrasco";
        byte age = 27;
        float hourlyWage = 32.17f;
        
        String fullName = firstName + ' ' + middleInitial + ". " + lastName;
        
        // use sout and press tab
        System.out.println("Hi, my full name is " + fullName + '.');
        System.out.println("I'm " + age + " years old.");
        System.out.println("My hourly wage is " + hourlyWage + '€');
    }
    
}
