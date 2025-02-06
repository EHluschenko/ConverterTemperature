package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter temperature version 1.0");
        double cels=20;
        double far=40;
        double cel=convFarToCel(far);
        System.out.println("Converter Fahrenheit to degrees Celsius");
        System.out.println("Result is: "+cel+"°C");

        System.out.println("Converter degrees Celsius to Fahrenheit");
        double fahr=convCelToFar(cels);
        System.out.println("Result is: "+fahr+"°F");
    }
    public static double convFarToCel(double far){
        return (far-32)/1.8;
    }
    public static double convCelToFar(double cel){
        return cel*1.8+32;
    }
}
