package LabManual;
import java.awt.*;
// exp -22
public class RahulFrame extends Frame {
    public RahulFrame() {
        super("Frame Of Rahul");

        setLayout(new FlowLayout());
        setBackground(Color.GRAY);
        setSize(300, 400);
      //  setCursor(Cursor.HAND_CURSOR);
        setVisible(true);

        Label label1 = new Label("Label 1");
        Label label2 = new Label("Label 2");

        label1.setBackground(Color.green);
        label1.setForeground(Color.RED);

        label2.setBackground(Color.green);
        label2.setForeground(Color.RED);

        add(label1);
        add(label2);
    }
    public static void main(String[] args) {
        RahulFrame f1 = new RahulFrame();
        f1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    
}