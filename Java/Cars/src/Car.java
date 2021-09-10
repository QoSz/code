public class Car {
    // Initializing the variables
    private String _brand;
    private String _type;
    private String _color;
    private int _year;
    private int _hp;

    // Getter and Setters also known as the objects attributes
    public void setBrand(String brand) {
        _brand = brand;
    }

    public String getBrand() {
        return _brand;
    }

    public void setType(String type) {
        _type = type;
    }

    public String getType() {
        return _type;
    }

    public void setColor(String color) {
        _color = color;
    }

    public String getColor() {
        return _color;
    }

    public void setYear(int year) {
        _year = year;
    }

    public int getYear() {
        return _year;
    }

    public void setHp(int hp) {
        _hp = hp;
    }

    public int getHp() {
        return _hp;
    }

    // Default constructor -> Attributes that need to be specified when creating the object.
    Car(String brand, String type, String color, int year, int hp) {
        setBrand(brand);
        setType(type);
        setColor(color);
        setYear(year);
        setHp(hp);
    }

    // Creating methods for the cars

    void _accelerate() {
        System.out.println("The car is accelerating!");
    }

    void _break() {
        System.out.println("The car is slowing down!");
    }

}

// Inheriting from Car
class Vehicle extends Car {

    private int _speed;

    public void setSpeed(int speed) {
        _speed = speed;
    }

    public int getSpeed() {
        return _speed;
    }

    Vehicle(String brand, String type, String color, int year, int hp, int speed) {
        super(brand, type, color, year, hp);
        setSpeed(speed);
    }
    
}
