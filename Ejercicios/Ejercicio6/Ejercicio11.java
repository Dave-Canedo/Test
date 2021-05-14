public class Ejercicio11 {
    // Escribir una función que calcule el mínimo común múltiplo de tres números.
    public static void main(String[] args) {
        int number1 = 16;
        int number2 = 12;
        int number3 = 21;

        System.out.println(findMCM(number1, number2, number3));
    }
    public static int findMCM(int n1, int n2, int n3) {
        int majorNumber = 0;
        int mcm = 0;
        int number = 0;

        if(n1>=n2 && n1>=n3) {
            majorNumber = n1;
        } else if(n2>=n1 && n2>=n3) {
            majorNumber = n2;
        } else if(n3>=n1 && n3>=n2) {
            majorNumber = n3;
        }
        number = majorNumber;

        while(majorNumber%n1!=0 || majorNumber%n2!=0 || majorNumber%n3!=0) {
            majorNumber+=number;
        }
        mcm = majorNumber;
        return mcm;
    }
}