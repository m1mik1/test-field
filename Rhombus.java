 package dev.stillsucking.printing.patterns.Rhombus;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a height: "); 
        int d = scanner.nextInt();
        for (int j = 0; j < d; j++) {
            for (int i = 0; i < (d - j); i++) System.out.print(" ");
            System.out.print("*");
            
            for (int i = 0; i < j; i++) System.out.print("*");
            for (int i = 0; i < (j); i++) System.out.print("*");
            System.out.println();
        }
        
        int r = d;
        for (int j = 0; j < d; j++) {
            for (int i = 1; i <= j; i++) System.out.print(" ");
            for (int i = 0; i < (r + r + 1); i++) System.out.print("*");
            r--;System.out.println();
        }
        
        for (int i = 0; i < d; i++) System.out.print(" ");
        System.out.print("*");
    }
}
