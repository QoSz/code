package bottles;

public class Main {
    public static void main(String[] args) {
        Bottle b = new Bottle(34, 100);

        System.out.println(b.getWaterAmount());
        System.out.println(b.getCapacity());
        b.fill(85);
        System.out.println(b.getWaterAmount());
    }
}
