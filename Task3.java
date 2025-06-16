public class Task3{


    public static double litersToGallons(double liters) {
        return liters * 0.264172; // Conversion factor
    }


    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; // Conversion formula
    }

    // Method to convert feet to meters
    public static double feetToMeters(double feet) {
        return feet * 0.3048; // Conversion factor
    }

    // Main method
    public static void main(String[] args) {
        // Example values for conversion
        double liters = 10; // 10 liters
        double fahrenheit = 98.6; // 98.6 degrees Fahrenheit
        double feet = 30; // 30 feet


        double gallons = litersToGallons(liters);
        double celsius = fahrenheitToCelsius(fahrenheit);
        double meters = feetToMeters(feet);


        System.out.printf("%.1f Liters is %.2f Gallons%n", liters, gallons);
        System.out.printf("%.1f Fahrenheit is %.2f Celsius%n", fahrenheit, celsius);
        System.out.printf("%.1f Feet is %.2f Meters%n", feet, meters);
    }
}