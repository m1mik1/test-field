package dev.stillsucking;

import java.util.Scanner;

//читать методы,функции джава
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int x = input();
        System.out.println("Factorial of your number is:  " + factorial(x));
    }

    static int factorial(int x) {
        int factorial2 = 1;
        for (int i = 1; i <= x; i++) {
            factorial2 = factorial2 * i;

        }
        return factorial2;
    }

    static int input() {
        Scanner scanner1 = new Scanner(System.in);
        return scanner1.nextInt();
    }


}
