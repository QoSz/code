public class Main {
    public static void main(String[] args) {
        Cup c = new Cup(100, 53, "Glass", "Tea");
        Cup d = new Cup(200, 175, "Glass", "Coffee");
        Cup e = new Cup();

        System.out.println("Capacity input was: " + c.getCapacity());
        System.out.println("Water amount input was: " + c.getWaterAmount());
        System.out.println("Material input was: " + c.getMaterialName());
        System.out.println("Substance input was: " + c.getSubstanceInside());

        c.mixingSubstance();
        c.transferWater(25, d);
        System.out.println(c.getWaterAmount());
        System.out.println(d.getWaterAmount());


    }
}
