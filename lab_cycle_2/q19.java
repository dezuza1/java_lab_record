class Temperature {

    static double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
class q19 {
    public static void main(String[] args) {
        double celsius = 30;

        double fahrenheit = Temperature.convertToFahrenheit(celsius);

        System.out.println("Fahrenheit = " + fahrenheit);
    }
}

