package LabManual;

import java.util.Scanner;

public class Exp2 {
    public static void main(String[] args) {
       
        try (Scanner sc = new Scanner(System.in)) {
            // Read the number of elements from the user
            System.out.println("Enter the size of Array:");
            int size = sc.nextInt();

            // Create an array to store the elements
            float[] numbers = new float[size];

            // Read the elements from the user
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextFloat();
            }

            // Display menu
            System.out.println("1-Sum");
            System.out.println("2-Average");
            System.out.println("3-Minimum");
            System.out.println("4-Maximum");

            int choice;
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            float sum = 0;
            float min = numbers[0];
            float max = numbers[0];

            // Calculate sum, min, and max
            for (int i = 0; i < size; i++) {
                sum += numbers[i];
                if (numbers[i] < min) {
                    min = numbers[i];
                }
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }

            switch (choice) {
                case 1:
                    System.out.println("Sum is " + sum);
                    break;
                case 2:
                    System.out.println("The average is " + sum / size);
                    break;
                case 3:
                    System.out.println("The minimum value is " + min);
                    break;
                case 4:
                    System.out.println("The maximum value is " + max);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
