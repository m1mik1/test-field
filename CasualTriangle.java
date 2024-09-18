package dev.stillsucking.printing.patterns.casualTriangle;

import java.util.Scanner;

public class CasualTriangle {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a height: ");
        int d = scanner.nextInt();
        for (int k = 0; k <= d; k++) {
            for (int i = 0; i < k; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
