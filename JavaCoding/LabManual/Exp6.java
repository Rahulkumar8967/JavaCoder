package LabManual;
import java.util.Scanner;

class Exp6 {
    static int account = 24567891;
    float amount;

    public Exp6() {
        amount = 1000000;
        System.out.println("Your amount is " + amount);
       // amount++;
    }

    public void display() {
        System.out.println("Account no. is " + account);
        System.out.println("Current Amount is " + amount);
    }

    public void withdraw(float x) {
        if (amount <= x + 1000) {
            System.out.println("You cannot withdraw");
        } else {
            System.out.println("<---Before withdrawal");
            display();
            amount -= x;
            System.out.println("<---After withdrawal");
            display();
        }
    }

    public void deposit(float x) {
        System.out.println("<---Before Deposit");
        display();
        amount += x;
        System.out.println("<---After Deposit");
        display();
    }

    static class Account {
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                int ch = 0;
                float amt, amt1;
                Exp6 b1 = new Exp6(); // object of class
                
                while (ch != 4) {
                    System.out.println("1-Display the current Status");
                    System.out.println("2-For withdrawal");
                    System.out.println("3-For deposit");
                    System.out.println("4-For Exit");

                    System.out.println("Enter your choice");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            b1.display();
                            break;
                        case 2:
                            System.out.println("Enter the amount for withdrawal");
                            amt = sc.nextFloat();
                            b1.withdraw(amt);
                            break;
                        case 3:
                            System.out.println("Enter the amount for Deposit");
                            amt1 = sc.nextFloat();
                            b1.deposit(amt1);
                            break;
                        case 4:
                            break;
                    }
                }
            }
        }
    }
}
