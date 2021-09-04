package bottles;

public class Bottle {
    // Bottles attributes
    private int _waterAmount;
    private int _capacity;

    // Setter for setting the water amount
    public void setWaterAmount(int waterAmount) {
        _waterAmount = waterAmount;
    }

    // Getter to get the water amount in the bottle currently
    public int getWaterAmount() {
        return _waterAmount;
    }

    // Setter to set the capacity of the bottle
    public void setCapacity(int capacity) {
        _capacity = capacity;
    }

    // Getter to get the capacity of the bottle
    public int getCapacity() {
        return _capacity;
    }

    // Constructor that takes two argument the current water amount
    // in the bottle and the capacity of the bottle.
    Bottle(int waterAmount, int capactiy) {
        setWaterAmount(waterAmount);
        setCapacity(capactiy);
    }

    // Method to fill the bottle and to make sure the amount filled is not greater than the capacity.
    void fill(int amount) {
        if (amount <= (getCapacity() - getWaterAmount())) {
            setWaterAmount(getWaterAmount() + amount);
        } else {
            System.out.println("The amount entered will not fit the bottle!");
        }
    }

    // Method to pour out water from the current amount of water
    boolean pour(int amount) {
        if (getWaterAmount() >= amount) {
            setWaterAmount(getWaterAmount() - amount);
        } else {
            return false;
        }
        return true;
    }

    // Method to transfer water from one bottle to another
    void transferWater(int amount, Bottle transferToBottle) {
        if (pour(amount)) {
            transferToBottle.fill(amount);
        } else {
            System.out.println("There is not enough water to fill the bottle");
        }

    }



}
