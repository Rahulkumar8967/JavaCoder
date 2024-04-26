package LabManual;

public class Exp10 {
    String name;
    double balance;

    Exp10(String n1, double b1) {
        name = n1;
        balance = b1;
    }

    public void show() {
        if (balance < 0) {
            System.out.println("<------>");
        }
        System.out.println(name + ":$" + balance);
    }

    public static void main(String[] args) {
        Exp10 b1 = new Exp10("Aarti", 6000);
        b1.show();

        Exp10 b2 = new Exp10("Reena", 5000);
        b2.show();
    }
    }

