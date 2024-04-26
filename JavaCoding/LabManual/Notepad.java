package LabManual;
// exp 26
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class Notepad extends Frame {
    private TextArea textArea;
    private File currentFile;

    public Notepad() {
        super("Notepad");
        setSize(600, 400);
        setVisible(true);

        MenuBar menuBar = new MenuBar();
        setMenuBar(menuBar);

        Menu fileMenu = new Menu("File");
        menuBar.add(fileMenu);

        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");
        
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        textArea = new TextArea();
        add(textArea);

        newItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                newFile();
            }
        });

        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        });

        saveItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveFile();
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void newFile() {
        textArea.setText("");
        currentFile = null;
    }

    private void openFile() {
        FileDialog fileDialog = new FileDialog(this, "Open File", FileDialog.LOAD);
        fileDialog.setVisible(true);
        String filename = fileDialog.getFile();
        String directory = fileDialog.getDirectory();

        if (filename != null && directory != null) {
            try {
                File file = new File(directory, filename);
                Scanner scanner = new Scanner(file);
                textArea.setText("");
                while (scanner.hasNextLine()) {
                    textArea.append(scanner.nextLine() + "\n");
                }
                scanner.close();
                currentFile = file;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveFile() {
        FileDialog fileDialog = new FileDialog(this, "Save File", FileDialog.SAVE);
        fileDialog.setVisible(true);
        String filename = fileDialog.getFile();
        String directory = fileDialog.getDirectory();

        if (filename != null && directory != null) {
            try {
                File file = new File(directory, filename);
                FileWriter writer = new FileWriter(file);
                writer.write(textArea.getText());
                writer.close();
                currentFile = file;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Notepad frame = new Notepad();
    }
}
