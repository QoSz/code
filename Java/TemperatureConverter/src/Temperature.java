public class Temperature {
    private float _celsius;
    private float _fahrenheit;

    public void setCelsius(float celsius) {
        _celsius = celsius;
    }

    public float getCelsius() {
        return _celsius;
    }

    public void setFahrenheit(float fahrenheit) {
        _fahrenheit = fahrenheit;
    }

    public float getFahrenheit() {
        return _fahrenheit;
    }

    public float celsiusToFahrenheit(float celsius) {
        return (celsius * 9/5) + 32;
    }

    public float fahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public void printCelsiusToFahrenheit() {
        System.out.printf("%f°C to Fahrenheit is: %f°F\n",getCelsius(), celsiusToFahrenheit(getCelsius()));
    }

    public void printFahrenheitToCelsius() {
        System.out.printf("%f°F to Celsius is %f°C\n", getFahrenheit(), fahrenheitToCelsius(getFahrenheit()));
    }
}
