public class Main {
    public static void main(String[] args) {
        Final F = new Final(5);

        for (int i = 0; i < 5; i++) {
            F.add();
            System.out.printf("%s", F);
        }
    }
}
