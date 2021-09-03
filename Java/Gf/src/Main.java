import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gf g1 = new Gf("Kathy");
//        System.out.print("Enter the name of your first gf here: ");
////        String girlName = sc.nextLine();
////        g1.setGirlName(girlName);
        g1.saying();

        Gf g2 = new Gf("Taara");
        g2.saying();
    }
}
