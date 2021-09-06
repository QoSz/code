public class Playstation {
    private String _color;
    private double _weight;
    private String[] _accessories;
    private boolean power = false;

    public void setColor(String color) {
        _color = color;
    }

    public String getColor() {
        return _color;
    }

    public void setWeight(double weight) {
        _weight = weight;
    }

    public double getWeight() {
        return _weight;
    }

    public void setAccessories(String[] accessories) {
        _accessories = accessories;
    }

    public String[] getAccessories() {
        return _accessories;
    }

    public boolean getPower() {
        return power;
    }

    public boolean powerOn() {
        return power = true;
    }

    public boolean powerOff() {
        return power = false;
    }

    public void isStreaming() {
        power = true;
        System.out.println("The playstation is currently streaming to YouTube!");
    }

    Playstation(String color, double weight, String[] accessories) {
        setColor(color);
        setWeight(weight);
        setAccessories(accessories);
    }
}
