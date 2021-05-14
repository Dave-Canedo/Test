import java.util.Scanner;
// Crear una tabla de tamaño 7x7 y rellenarla de manera quye la diagonal principal sean 1 y el resto 0
public class Exercise5 {
    public static void main(String[] args) {
        int[][] oneDiagonal = new int[7][7];

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca los datos para el array bidimensional");

        for(int i = 0; i<oneDiagonal.length; i++ ) {
            for(int j = 0; j<oneDiagonal.length; j++) {
                System.out.print("introduzca los datos para la posicion "+i+"."+j+": ");

                oneDiagonal[i][j] = sc.nextInt();
            }
        }
        System.out.println("Los datos introducidos son:");
        for(int i = 0; i<oneDiagonal.length; i++) {
            for(int j = 0; j<oneDiagonal.length; j++) {
                System.out.print(oneDiagonal[i][j]+" ");            
            }
            System.out.println("");
        }
        System.out.println("Mostrando el numeral 1 en diagonal");

        for(int i = 0; i<oneDiagonal.length; i++) {
            for(int j = 0; j<oneDiagonal.length; j++) {
                if(j==i) {
                    oneDiagonal[i][j] = 1;
                    System.out.print(oneDiagonal[i][j]+" ");
                } else {
                    oneDiagonal[i][j] = 0;
                    System.out.print(oneDiagonal[i][j]+" ");
                }
            }
            System.out.println("");
        }
    }
}
