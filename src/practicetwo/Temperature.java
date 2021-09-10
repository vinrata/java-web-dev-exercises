package practicetwo;

public class Temperature {

    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        double absoluteZeroFahrenheit = -459.67;

        if (aFahrenheit < absoluteZeroFahrenheit) {
            System.out.println("Value is below absolute zero");
        }

        fahrenheit = aFahrenheit;
    }
    public double getCelsius() {
        System.out.println("Celsius is: " + (fahrenheit - 32) * 5.0 / 9.0);
        return (fahrenheit - 32) * 5.0 / 9.0;
    }


}