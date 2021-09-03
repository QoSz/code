public class Main {
    public static void main(String[] args) {
        System.out.printf("factorial of %s is %d\n", 4, Main(4));
        System.out.printf("factorial of %s is %d\n", 5, Main(5));
        System.out.printf("factorial of %s is %d\n", 3, Main(3));
        System.out.printf("factorial of %s is %d\n", 1, Main(1));
        System.out.printf("factorial of %s is %d\n", 2, Main(2));
    }

    public static int Main(int n) {
        if (n <= 1) {
            return 1;
        }
        else {
            return n * Main(n - 1);
        }
    }
}
