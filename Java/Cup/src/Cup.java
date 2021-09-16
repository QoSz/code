public class Cup {
    private int _capacity;
    private int _waterAmount;
    private String _materialName;
    private String _substanceInside;

    // Getters and Setters
    public void setCapacity(int capacity) {
        _capacity = capacity;
    }

    public int getCapacity() {
        return _capacity;
    }

    public void setWaterAmount(int waterAmount) {
        _waterAmount = waterAmount;
    }

    public int getWaterAmount() {
        return _waterAmount;
    }

    public void setMaterialName(String materialName) {
        _materialName = materialName;
    }

    public String getMaterialName() {
        return _materialName;
    }

    public void set_substanceInside(String substanceInside) {
        _substanceInside = substanceInside;
    }

    public String getSubstanceInside() {
        return _substanceInside;
    }

    // Default constructor
    public Cup(int capacity, int waterAmount, String materialName, String substanceInside) {
        setCapacity(capacity);
        setWaterAmount(waterAmount);
        setMaterialName(materialName);
        set_substanceInside(substanceInside);
    }


    // Creating methods
    void mixingSubstance() {
        System.out.println("You are currently mixing " + getSubstanceInside());
    }

    void fill(int amount) {
        if (getWaterAmount() + amount <= getCapacity()) {
            setWaterAmount(getWaterAmount() + amount);
        } else {
            System.out.println("Amount required will not fit the bottle.");
        }
    }

    boolean pour(int amount) {
        if (getWaterAmount() >= amount) {
            setWaterAmount(getWaterAmount() - amount);
        } else {
            System.out.println("The is not enough water for the amount required.");
            return false;
        }
        return true;
    }

    void transferWater(int amount, Cup cupToTransfer) {
        if (pour(amount)) {
            cupToTransfer.fill(amount);
        } else {
            System.out.println("There is not enough water to transfer to the other cup");
        }
    }
}
