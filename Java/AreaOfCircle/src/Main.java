public class Main {
    private int radius;

    public void setRadius(int x) {
        radius = x;
    }

    public double calculateArea() {
        return Math.PI * radius * radius ;
    }

    public void printRadius() {
        System.out.println(calculateArea());
    }

    public static void main(String[] args) {
        Main circle = new Main();
        circle.setRadius(1);
        circle.printRadius();
    }
}
