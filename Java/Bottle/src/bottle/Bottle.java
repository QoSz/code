package bottle;

public class Bottle {
    double waterAmount;
    double capacity;

    public double getCapacity() {
        return capacity;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    Bottle(double waterAmount, double capacity) {
        this.waterAmount = waterAmount;
        this.capacity = capacity;
    }

    void fill(double amount) {
        if (waterAmount < capacity) {
            this.waterAmount += amount;
        } else {
            System.out.println("The amount of water required will not fit the bottle.");
        }
    }

    boolean pour(double amount) {
        if (this.waterAmount > amount) {
            this.waterAmount -= amount;
        } else {
            return false;
        }
        return true;
    }

    void transferWater(double amount, Bottle transferToBottle) {
        if (this.pour(amount)) {
            transferToBottle.fill(amount);
        } else {
            System.out.println("There is not enough water to transfer!");
        }
    }

    public static void main(String[] args) {
        Bottle[] bottle = new Bottle[3];

        bottle[0] = new Bottle(1200, 1500);
        bottle[1] = new Bottle(500, 500);
        bottle[2] = new Bottle(750, 1000);

        bottle[1].transferWater(50, bottle[0]);
        System.out.println(bottle[0].waterAmount);

        bottle[0].fill(500);
        System.out.println(bottle[0].waterAmount);

    }
}
