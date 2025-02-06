package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter temperature version 1.0");
        double far=40;
        double cel=convFarToCel(far);
        System.out.println("Converter Fahrenheit to degrees Celsius");
        System.out.println("Result is: "+cel+"°C");
    }
    public static double convFarToCel(double far){
        return (far-32)/1.8;
    }
}
