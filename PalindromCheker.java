package dev.stillsucking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//читать методы,функции джава
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a word: ");
       String str = input();
       palindrome(str);
    }
    static String palindrome(String str) {
        List<String> s = new ArrayList<>();
       for (int i = str.length() - 1; i >= 0; i--) {
           char c = str.charAt(i);
           s.add(String.valueOf(c));
        }
       System.out.println(s);
        String reversedStr = String.join("", s);
       if (reversedStr.equals(str)){
           System.out.println("This word is a palindrome");

       }
       else {
           System.out.println("This word is not a palindrome");
       }
       return str;
   }
       static String input() {
           Scanner scanner1 = new Scanner(System.in);
           return scanner1.nextLine();
       }


   }
