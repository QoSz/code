package conditionaloperators;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter you age here: ");
        int age = sc.nextInt();

        System.out.println(age > 50 ? "You are old!" : "You are a young buck!");
    }
}
