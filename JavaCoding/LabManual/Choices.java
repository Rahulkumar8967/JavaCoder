package LabManual;
// exp 24
import java.awt.*;
import java.awt.event.*;

public class Choices extends Frame {
    private Choice choice;
    private Label selectedLabel;

    public Choices() {
        super("Choice");

        setLayout(new FlowLayout());
        setSize(300, 200);
        setVisible(true);

        choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");
        choice.add("Option 4");
        choice.add("Option 5");
        add(choice);
    }

    public static void main(String[] args) {
        Choices frame = new Choices();
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
