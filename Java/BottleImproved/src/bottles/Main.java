package bottles;

public class Main {
    public static void main(String[] args) {
        Bottle b = new Bottle(34, 100);
        Bottle c = new Bottle(30, 70);

        System.out.println("The current water amount before is: " + b.getWaterAmount());
        System.out.println("Water bottle water capacity is: " + b.getCapacity());
        b.fill(45);
        System.out.println("Water amount after the bottle was filled with some watter: " + b.getWaterAmount());
        b.pour(29);
        System.out.println("Water amount after pouring out some water from the bottle: " + b.getWaterAmount());
        b.transferWater(40, c);
        System.out.println(c.getWaterAmount());
        System.out.println(b.getWaterAmount());
    }
}
