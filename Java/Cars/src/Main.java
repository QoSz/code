public class Main {
    public static void main(String[] args) {
        Car L = new Car("Mercedes", "AMG", "Black", 2021, 1200);
        System.out.printf("The car brand is %s\n", L.getBrand());
        System.out.printf("The cars type is %s\n", L.getType());

        L._accelerate();

        Vehicle v = new Vehicle("Lamborghini", "Urus", "Lime-Green", 2021, 1500, 193);
        System.out.println(v.getSpeed());
        v._break();
    }
}
