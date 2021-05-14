import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        
     // Dibuja un cuadrado de n elementos de lado utilizando *.

        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca un numero");

        int number = sc.nextInt();

        for(int i = 0; i<number; i++) {

            for(int i2 = 0; i2<number; i2++) {

                System.out.print("*");
            }

            System.out.println("");
        } 
        
    }
}