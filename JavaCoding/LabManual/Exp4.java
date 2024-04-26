package LabManual;

import java.util.Scanner;

class Exp4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int HCF = calculateHCF(a, b);
        System.out.println("HCF is:" + HCF);

        int LCM = (a * b) / HCF;
        System.out.println("LCM IS:" + LCM);
    }

    public static int calculateHCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateHCF(b, a % b);
    }
}