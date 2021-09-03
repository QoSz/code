package gradecalac;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int grade;
        int counter = 0;
        int num_of_modules = 5;

        while (counter < num_of_modules) {
            System.out.println("Input you grade: ");
            grade = sc.nextInt();
            total += grade;
            counter++;
        }
        System.out.printf("Your average grade is %d", total/num_of_modules);
    }
}
