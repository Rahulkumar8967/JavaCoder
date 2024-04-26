package JavaCoding.javacoder.src.RahulLab;

public class exp1 {

    void eat() {
        System.out.println("Animal is eating");
    }

    static class Dog { // Made Dog class static
        void bark() {
            System.out.println("Dog is barking"); // Corrected the message
        }
    }

    public static void main(String[] args) {
        exp1.Dog g = new exp1.Dog(); // Corrected the instantiation
        g.bark(); // Calling bark method
        exp1 animal = new exp1(); // Instantiating exp1 class to access eat() method
        animal.eat(); // Calling eat method
    }
}
