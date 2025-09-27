package app;

public class Main {

    private static final double CONV_MI_TO_KM = 1.609344;

    public static void main(String[] args) {
        System.out.println("Distance Converter App.");

        double miles = 10;
        double kilometers = convMiToKm(miles);

        System.out.println("Result is: " +  kilometers + " km.");
    }

    private static double convMiToKm(double miles) {
        return miles * CONV_MI_TO_KM;
    }
}
