import javax.swing.*;

public class MyFirstWindow {

    public static void main(String[] args) 
    {
        JOptionPane.showMessageDialog(null, // center on monitor
                "Hello world",  // message (args)
                "Java rocks",   // title
                JOptionPane.WARNING_MESSAGE);   // icon
    }
    
}
