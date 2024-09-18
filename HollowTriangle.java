package dev.stillsucking.printing.patterns.hollowTriangle.;

import java.util.Scanner;

public class HollowTriangle {
      public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a height: ");
        int h = scanner.nextInt();
        for (int j = 0; j < h; j++) {
            System.out.print("*");
            for (int i = 0; i <= j; i++) {
                if (i == j && i != 0) {
                    System.out.print("*");
                } else if (j == h - 1) {
                    System.out.print("*");
                } else if (i != j) {
                    System.out.print(" ");
                }
            }
        System.out.println(" ");
    }
  }
}


