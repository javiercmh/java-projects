import javax.swing.*;

public class VariablesInWindow {

    public static void main(String[] args) {
        // declare and initialize variables (using last assignment as reference)
        String firstName = "Javier";
        char middleInitial = 'A';
        String lastName = "Carrasco";
        byte age = 27;
        float hourlyWage = 32.17f;
        
        String fullName = firstName + ' ' + middleInitial + ". " + lastName;
        
        JOptionPane.showMessageDialog(null, // center on monitor
                "Hi, my full name is " + fullName + '.'
                + "\nI'm " + age + " years old."
                + "\nMy hourly wage is " + hourlyWage + '€',  // message (args)
                "Java rocks",   // title
                JOptionPane.WARNING_MESSAGE);   // icon
        
    }
    
}
