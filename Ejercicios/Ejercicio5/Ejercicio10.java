import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int NewNumber, Position;

        System.out.println("introduzca 10 numeros");

        for(int i = 0; i<9; i++) {

            System.out.println("introduzca el "+(i+1));

            numbers[i] = sc.nextInt();
        }

        System.out.print("introduzca un nuevo numero: ");

            NewNumber = sc.nextInt();

        System.out.println("introduzva la posicion para el nuevo numero");

            Position = sc.nextInt();

        for(int i=numbers.length-1; i>Position; i--) {

            numbers[i] = numbers[i-1];
        }

        numbers[Position] = NewNumber;

        for(int i = 0; i<=9; i++) {

            System.out.print(numbers[i]+", ");

        }
    }
}