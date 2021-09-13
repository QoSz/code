import java.util.Random;
import java.util.Scanner;

public class Guess {
    private int _randomNumber;
    boolean condition = true;
    boolean flag = true;
    Scanner sc = new Scanner(System.in);
    int numberOfTries;

    public void setRandomNumber(int number) {
        _randomNumber = number;
    }

    public int getRandomNumber() {
        return _randomNumber;
    }

    public void generateRandomNumber() {
        Random number = new Random();

        int numberGenerated = number.nextInt((10 - 1) + 1) + 1;
        setRandomNumber(numberGenerated);
    }

    public void enterNumber() {


        while (condition) {

            System.out.println("Enter your guess here: ");
            int number = sc.nextInt();
            numberOfTries += 1;

            if (number > getRandomNumber()) {
                System.out.println("Too high");
            } else if (number < getRandomNumber()) {
                System.out.println("Too Low");
            } else if (number == getRandomNumber()) {
                System.out.println("The number entered is CORRECT!!!");
                condition = false;
            } else {
                System.out.println("Please enter a number next time");
            }
        }

        System.out.println("You guessed the number in "  + numberOfTries + " tries.");

    }
}
