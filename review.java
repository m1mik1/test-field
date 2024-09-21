package dev.stillsucking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//читать методы,функции джава
public class Main {
    public static void main(String[] args) {
cheking();
    }
    static void gcd(){
        System.out.println("Enter two numbers to find gcd: ");
        Integer a=Integer.parseInt(input());
        Integer b=Integer.parseInt(input());
        a = Math.abs(a);
        b = Math.abs(b);
        int third=1;
        if (a>b) {
            while (third!=0){
                third = a %b;
                a=b;
                b=third;
            }
            System.out.println("GCD of your numbers is: "+ a);
        }
        else if (b>=a){
            while (third!=0){
                third = b%a;
                b=a;
                a=third;
            }
            System.out.println("GCD of your numbers is: "+ b);
        }
    }

    static void conversion() {
        System.out.println("Enter a number and what type of temperature it is: ");
        double temperature = Double.parseDouble(input());
        Character format = Character.toLowerCase(input().charAt(0));
        switch (format) {
            case 'c':
                double f = (temperature * 9 / 5 + 32);
                double k = temperature + 273;
                System.out.println("Fahrenheit: " + f);
                System.out.println("Kelvin: " + k);
                break;
            case 'f':
                double c = ((temperature - 32) * 5 / 9);
                double kel = (temperature - 32) * 5 / 9 + 273;
                System.out.println("Celsius: " + c);
                System.out.println("Kelvin: " + kel);
                break;
            case 'k':
                double far = ((temperature - 273.15) * 9 / 5 + 32);
                double cel = (temperature - 273.15);
                System.out.println("Farenheit: " + far);
                System.out.println("Celsius: " + cel);
                break;
            default:
                System.out.println("Invalid format of tempeture");
                break;
        }
    }

    static void cheking() {
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(input());
        int divide = 0;
        boolean num = false;
        for (int i = 2; i < number; i++) {
            divide = number % i;
            if (divide == 0) {
                num = true;
                break;
            }
        }
        if (num) {
            System.out.println(number + " is a divisible number");
        } else {
            System.out.println(number + " is prime number.");
        }
    }

    static void longest() {
        System.out.println("Enter three numbers: ");
        int n = Integer.parseInt(input());
        int k = Integer.parseInt(input());
        int l = Integer.parseInt(input());

        if (n > k && n > l) {
            System.out.println("First number is the largest");
        } else if (k > n && k > l) {
            System.out.println("Second number is the largest");
        } else if (l > n && l > k) {
            System.out.println("Third number is the largest");
        } else if (n == k && n == l) {
            System.out.println("All numbers are the same");
        } else {
            System.out.println("There is a tie between the largest numbers");
        }
    }

    static String palindrome(String str) {
        System.out.println("Enter a word: ");
        List<String> s = new ArrayList<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            s.add(String.valueOf(c));
        }
        System.out.println(s);
        String reversedStr = String.join("", s);
        if (reversedStr.equals(str)) {
            System.out.println("This word is a palindrome");

        } else {
            System.out.println("This word is not a palindrome");
        }
        return str;
    }

    static String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static void arraySum() {
        System.out.println("Enter an number: ");
        int num2 = Integer.parseInt(input());
        int sum = 0;
        for (int i = 0; i <= num2; i++) {
            sum += i;
        }
        System.out.println("Sum of array numbers is: " + sum);
    }

}
