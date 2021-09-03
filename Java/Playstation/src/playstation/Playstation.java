package playstation;

public class Playstation {
    String color;
    int storageCapacity;
    double weight;
    String[] accessories = {"Power Cable", "Controller", "HDMI Cable"};
    static boolean power;

    Playstation(String color, int storageCapacity, double weight) {
        this.color = color;
        this.storageCapacity = storageCapacity;
        this.weight = weight;
    }

    public String[] getAccessories() {
        return accessories;
    }

    public void setAccessories(String[] accessories) {
        this.accessories = accessories;
    }

    public int accessoriesLength() {
        return accessories.length;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public static void powerOn() {
        power = true;
    }

    public static void powerOff() {
        power = false;
    }

    public static void main(String[] args) {
        Playstation ps4 = new Playstation("White", 512, 12.4);

        System.out.println("PS4 Specs");
        System.out.println("");

        String ps4Color = ps4.getColor();
        System.out.println("Color of ps4 is: " + ps4Color);

        ps4.setStorageCapacity(756);
        int ps4Storage = ps4.getStorageCapacity();
        System.out.println("Storage capacity of the ps4 is: " + ps4Storage + "gb");

        double ps4Weight = ps4.getWeight();
        System.out.println("Weight of the ps4 is: " + ps4Weight + "Kg");

        for (int i = 0; i < ps4.accessoriesLength(); i++) {
            System.out.println("Ps4 comes with: " + ps4.getAccessories()[i]);
        }

        powerOn();
        System.out.println("PS4 is on: " + power);

        System.out.println("");
        Playstation ps5 = new Playstation("Black", 1024, 18.3);

        System.out.println("PS5 specs");
        System.out.println("");
        String ps5Color = ps5.getColor();
        System.out.println("PS5 Color: " + ps5Color);

        int ps5storageCapacity = ps5.getStorageCapacity();
        System.out.println("Storage capacity of ps5 is: " + ps5storageCapacity);

        double ps5Weight = ps5.getWeight();
        System.out.println("PS5 weight is: " + ps5Weight);

        ps5.setAccessories(new String[]{"Power Cable", "Controller", "HDMI Cable","Motion sensor", "VR headset"});
        for (int i = 0; i < ps5.accessoriesLength(); i++) {
            System.out.println("Accessories: " + ps5.getAccessories()[i]);
        }

        powerOff();
        System.out.println("PS5 is on: " + power);

    }
}
