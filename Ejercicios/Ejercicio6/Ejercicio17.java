public class Ejercicio17 {
    // Dado el valor de un ángulo, sería interesante saber su seno, coseno y tangente. Escribir una función que muestre en pantalla los datos anteriores.
    public static void main(String[] args) {
        double angle = 180;

        double radians = getRadians(angle);

        System.out.println("El seno del angulo es: "+Math.sin(radians));
        System.out.println(" ");

        System.out.println("El coseno del angulo es: "+Math.cos(radians));
        System.out.println(" ");

        System.out.println("La tangente del angulo es: "+Math.tan(radians));
        System.out.println(" ");
    }
    public static double getRadians(double angle) {
        angle = Math.toRadians(angle);
        return angle;
    }
}
