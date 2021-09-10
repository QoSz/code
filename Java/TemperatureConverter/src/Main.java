public class Main {
    public static void main(String[] args) {
        System.out.println("Celsius to Fahrenheit");
        Temperature T = new Temperature();
        T.setCelsius(25.3f);
        T.printCelsiusToFahrenheit();

        System.out.println("-----------------");
        System.out.println("Fahrenheit to Celsius");
        T.setFahrenheit(76.6f);
        T.printFahrenheitToCelsius();
    }
}
