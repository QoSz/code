package addingimproved;

import java.util.Scanner;



public class Adding2 {

    public Adding2() {
    }

    public static String ordinal(int i) {
        String[] suffixes = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
        switch (i % 100) {
            case 11:
            case 12:
            case 13:
                return i + "th";
            default:
                return i + suffixes[i % 10];
        }
    }

    void Add() {
        int addition = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers would you like to add? ");
        int n = sc.nextInt();

        for (int i = 1; i < n + 1; i++) {
            System.out.print("Enter your " + ordinal(i) + " number: ");
            int num_input = sc.nextInt();
            addition += num_input;
        }
        System.out.println(addition);
    }

    public static void main(String[] args) {
        Adding2 d1 = new Adding2();

        d1.Add();
    }
}
