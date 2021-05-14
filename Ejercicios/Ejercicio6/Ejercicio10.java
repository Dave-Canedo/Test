public class Ejercicio10 {
    // Escribir una función que calcule el mínimo común múltiplo de dos números.
    public static void main(String[] args) {
        int number1 = 25;
        int number2 = 150;

        System.out.println(findMCM(number1, number2));
    }
    public static int findMCM(int n1, int n2) {
        int majorNumber = 12;
        int mcm = 0;
        int number = 0;

        if(n1>=n2) {
            majorNumber = n1;
        } else {
            majorNumber = n2; 
        }
        number = majorNumber;

        while(majorNumber%n1!=0 || majorNumber%n2!=0) { 
            majorNumber+=number; 
        }
        mcm = majorNumber;

        return mcm;
    }
}