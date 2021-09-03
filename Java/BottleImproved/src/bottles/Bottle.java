package bottles;

public class Bottle {
    private int _waterAmount;
    private int _capacity;

    public void setWaterAmount(int waterAmount) {
        _waterAmount = waterAmount;
    }

    public int getWaterAmount() {
        return _waterAmount;
    }

    public void setCapacity(int capacity) {
        _capacity = capacity;
    }

    public int getCapacity() {
        return _capacity;
    }

    Bottle(int waterAmount, int capactiy) {
        setWaterAmount(waterAmount);
        setCapacity(capactiy);
    }

    void fill(int amount) {
        if (amount < getCapacity()) {
            _waterAmount += amount;
        } else {
            System.out.println("The amount required will not fill in the bottle!");
        }
    }


}
