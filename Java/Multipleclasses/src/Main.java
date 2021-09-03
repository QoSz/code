import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hello p1 = new Hello();

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name here: ");
        String name = sc.nextLine();

        p1.greeting(name);
    }
}
