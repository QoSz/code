import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean x = true;

        while (x) {
            try {
                System.out.println("Enter first number here: ");
                int n1 = sc.nextInt();
                System.out.println("Enter you second number here: ");
                int n2 = sc.nextInt();
                int sum = n1 / n2;
                System.out.printf("The answer is %d", sum);
                x = false;
            } catch (Exception e) {
                System.out.println("Calculation was not possible please try again.");
            }
        }
    }
}
