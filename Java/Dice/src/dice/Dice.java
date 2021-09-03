package dice;

import java.util.Random;
import java.util.Scanner;

public class Dice {
    Random num = new Random();
    int x;

    public Dice() {
    }

    void RandomNumber() {
        x = num.nextInt(6) + 1;
        System.out.println("The number you rolled was: " + x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dice d = new Dice();
        System.out.print("Enter the number of times you would like to roll the dice: ");
        int rolls = sc.nextInt();
        for (int i = 1; i <= rolls; i++) {
            System.out.print(i + "." + " ");
            d.RandomNumber();
        }
    }
}
