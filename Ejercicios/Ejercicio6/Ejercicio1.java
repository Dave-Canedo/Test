
import java.util.Scanner;
public class Ejercicio1 {
    // Hacer una función que reciba 3 números y retorne el mayor.
    static int maximumNumber(int n1, int n2, int n3) {

        int number = 0;

        if(n1>=n2 && n1>=n3) {
            number = n1;
        } else if(n2>n1 && n2>=n3) {
            number = n2;
        } else if(n3>n2 && n3>n1) {
            number = n3;
        } 

        return number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca tres numeros");

       int numbers = maximumNumber(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println(numbers);
    }
    
}
