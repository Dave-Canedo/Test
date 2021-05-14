import java.util.Scanner;
public class Ejercicio3 {
    //  Dibuja un cuadrado de n elementos de lado utilizando *
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca un numero");

        int number = sc.nextInt();

        for(int i = number; i>0; i--) {

            for(int i2 = number; i2>0; i2--) {

                System.out.print("*");
            }

            System.out.println("");
        } 
        
    }
}