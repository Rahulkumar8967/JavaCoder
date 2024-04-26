package LabManual;
// exp 25
import java.awt.*;
import java.awt.event.*;

public class Checkboxs extends Frame implements ItemListener {
    private CheckboxGroup checkboxGroup1, checkboxGroup2;
    private Checkbox checkbox1, checkbox2, checkbox3, checkbox4;

    public Checkboxs() {
        super("Checkbox");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setVisible(true);
        checkboxGroup1 = new CheckboxGroup();
        checkboxGroup2 = new CheckboxGroup();
        checkbox1 = new Checkbox("Option 1", checkboxGroup1, false);
        checkbox2 = new Checkbox("Option 2", checkboxGroup1, false);
        checkbox3 = new Checkbox("Option 3", checkboxGroup1, false);
        checkbox4 = new Checkbox("Option 4", checkboxGroup2, false);
        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);
        checkbox3.addItemListener(this);
        checkbox4.addItemListener(this);
        add(checkbox1);
        add(checkbox2);
        add(checkbox3);
        add(checkbox4);
    }

    public void itemStateChanged(ItemEvent e) {
        Checkbox selectedCheckbox = checkboxGroup1.getSelectedCheckbox();
        if (selectedCheckbox != null) {
            System.out.println("Selected option: " + selectedCheckbox.getLabel());
        }
    }

    public static void main(String[] args) {
        Checkboxs frame = new Checkboxs();
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
