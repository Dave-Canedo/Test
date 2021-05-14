public class Ejercicio8 {
    // Escribir una función que calcule el máximo común divisor de dos números.
    public static void main(String[] args) {
        int number1 = 18;
        int number2 = 39;

        System.out.println(findMCD(number1, number2));
    }
    public static  int findMCD(int n1, int n2) {
        int minorNumber = 0;
        int mcd = 0;

        if(n1<=n2) {
            minorNumber = n1;
        } else {
            minorNumber = n2;
        }

        while(minorNumber>0) { 
            if(n1%minorNumber==0 && n2%minorNumber==0) {
                mcd = minorNumber;
                break;
            }
            minorNumber--;
        }
        return mcd;
    }
}