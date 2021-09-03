package adding;

import java.util.Scanner;

public record Adding(int a, int b) {

    void Add() {
        System.out.println("The result of the numbers added is: " + (a + b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number you would like to add below: ");
        Adding num = new Adding(sc.nextInt(), sc.nextInt());
        num.Add();
    }
}
