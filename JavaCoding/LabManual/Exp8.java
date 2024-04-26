package LabManual;

interface base {
    void display();

    void show();
}

abstract class derived implements base {
    public void display() {
        System.out.println("hello AS");
    }
}

class derived2 extends derived {
    public void show() {
        System.out.println("you are looking so beautiful");
    }
}
public class Exp8 {
    public static void main(String[] args) {
        derived2 d1 = new derived2();
        d1.display();
        d1.show();
    }
}

