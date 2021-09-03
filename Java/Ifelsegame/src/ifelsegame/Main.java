package ifelsegame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 5 here: ");
        int num = sc.nextInt();

        if (num == 1)
            System.out.println("You must be the change you wish to see in the world. — Gandhi");
        else if (num == 2)
            System.out.println("Everybody is a genius. But if you judge a fish by its ability to climb a tree, it will live its whole life believing that it is stupid. — Albert Einstein");
        else if (num == 3)
            System.out.println("“A life spent making mistakes is not only more honorable, but more useful than a life spent doing nothing.” — George Bernhard Shaw");
        else if (num == 4)
            System.out.println("“He who fears he will suffer, already suffers because he fears.” — Michel De Montaigne");
        else if (num == 5)
            System.out.println("“Life is really simple, but we insist on making it complicated.” — Confucius");
        else
            System.out.println("You are dumb please enter a number from 1 to 5");
    }
}
