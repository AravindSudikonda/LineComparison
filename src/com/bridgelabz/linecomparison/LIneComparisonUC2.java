package com.bridgelabz.linecomparison;
import java.util.Scanner;
public class LIneComparisonUC2 {
    public static double lengthCalc(double x1, double y1, double x2, double y2) {
        double length = Math.sqrt(((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
        return length;
    }

    public static int LengthEquality(double length1, double lenght2) {
        if (length1 == lenght2) {
            System.out.println("Both the line are equal in size");
        } else if (length1 > lenght2) {
            System.out.println("First line is bigger in size");
        } else {
            System.out.println("Second line is bigger in size");
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to line comparision program");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1, y1 and x2, y2");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double length1 = lengthCalc(x1, y1, x2, y2);

        System.out.println("Enter a1, b1 and a2, b2 for line 2");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double length2 = lengthCalc(a1, b1, a2, b2);

        int length = LengthEquality(length1, length2);

    }
}

