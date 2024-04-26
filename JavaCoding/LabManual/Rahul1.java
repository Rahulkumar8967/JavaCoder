package LabManual;
import java.awt.*;
import java.awt.event.*;

public class Rahul1 extends Frame implements ActionListener {
    private List listBox;
    private TextField textField;
    private Button addButton;

    public Rahul1() {
        super("Lists of Rahul");

        setLayout(new FlowLayout());
        setSize(300, 400);
        setVisible(true);
        setBackground(Color.GRAY);

        listBox = new List(4);
        listBox.add("Item 1");
        listBox.add("Item 2");
        listBox.add("Item 3");
        listBox.add("Item 4");
        add(listBox);

        addButton = new Button("Add");
        addButton.addActionListener(this);
        add(addButton);

        textField = new TextField(30);
        add(textField);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String text = textField.getText();
            if (!text.isEmpty()) {
                listBox.add(text);
                textField.setText("");

            }
        }
        
    }
    
    public static void main(String[] args) {
         Lists frame = new Lists();
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
    }
    
