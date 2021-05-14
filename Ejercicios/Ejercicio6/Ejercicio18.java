public class Ejercicio18 {
    // Diseñar una función que calcule la distancia euclídea de dos puntos.
    public static void main(String[] args) {
        double x1 = -4;
        double x2 = -3;
        double y1 = -0.75;
        double y2 = 3.5;

        System.out.println(getDistance(x1, y1, x2, y2));
    }
    public static double getDistance(double x1, double y1, double x2, double y2) {
        double X = Math.pow(x2-x1,2);
        double Y = Math.pow(y2-y1,2);

        double distance = Math.sqrt(X+Y);
        return distance;
    }
}
