import javax.swing.*;

public class GUI {

    public void GuiFun(){
        //Shows a box that says "Enter your name"
        String name = JOptionPane.showInputDialog("Enter your name");
        //Displays a message
        JOptionPane.showMessageDialog(null, "Hello " + name + "! Please to meet you :)");
        //ShowInputDialog needs a string - So we need to parse this into an integer
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You're " + age + " years old");

        JOptionPane.showMessageDialog(null, "Name: " + name + "\n\nAge: " + age);

    }




}
