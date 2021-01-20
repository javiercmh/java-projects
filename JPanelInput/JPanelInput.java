import javax.swing.JOptionPane;

/**
 * JPanelInput
 */
public class JPanelInput {
    public static void main(String[] args) {
        String fName;
        Byte age;
        String input;
        char sex;

        fName = JOptionPane.showInputDialog(null, 
            "what is your first name",
            "Java rocks", 
            JOptionPane.QUESTION_MESSAGE);

        input = JOptionPane.showInputDialog(null,
            "How old are you?",
            "Java rocks", 
            JOptionPane.QUESTION_MESSAGE);
        age = Byte.parseByte(input);

        JOptionPane.showMessageDialog(null,
            "Hello" + fName + "!", 
            "Java rocks", 
            JOptionPane.INFORMATION_MESSAGE);

        System.out.println("hi");
    }
}