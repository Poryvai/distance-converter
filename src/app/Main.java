package app;

public class Main {

    private static final double CONV_MI_TO_KM = 1.609344;

    public static void main(String[] args) {
        System.out.println("Distance Converter App.");

        double mi = 10;
        double km = 20;
        double kilometers = convMiToKm(mi);
        double miles = convKmToMi(km);

        System.out.println(mi + " miles is: " +  kilometers + " kilometers.");
        System.out.println(km + " kilometers is: " +  miles + " miles.");
    }

    private static double convMiToKm(double miles) {
        return Math.round((miles * CONV_MI_TO_KM) * 1000.0) / 1000.0;
    }

    private static double convKmToMi(double kilometers) {
        return Math.round((kilometers / CONV_MI_TO_KM)  * 1000.0) / 1000.0;
    }
}
