public class Ejercicio12 {
    // Escriba una función que decida si dos números enteros positivos son amigos. Dos números son amigos, si la suma de sus divisores (distintos de ellos mismos) son iguales al otro entero.
    public static void main(String[] args) {
        int number1 = 624184;
        int number2 = 652664;

        if(isFriendNumbers(number1, number2)) {
            System.out.println(number1+" y "+number2+" son amigos");
        } else {
            System.out.println(number1+" y "+number2+" no son amigos");
        }
    }
    public static boolean isFriendNumbers(int n1, int n2) {

        int result1 = getDividers(n1);
        int result2 = getDividers(n2);

        return result1==n2 && result2==n1;
    }
    public static int getDividers(int n1) {
        int accumulator = 0;

        for(int i = 1; i<n1; i++) {
            if(n1%i==0) {
                accumulator+=i;
            }
        }
        return accumulator;
    }
}