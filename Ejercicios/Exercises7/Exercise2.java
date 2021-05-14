import java.util.Scanner;
public class Exercise2 {
    // Crear y cargar un array de tamano 4x4 y decir si es simetrico o no. Es decir si se obtiene el mismo array al cambiar las filas por las columnas
    public static void main(String[] args) {
        int[][] arraySymmetry = new int[4][4];
        int counter = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<arraySymmetry.length; i++) {
            for(int j = 0; j<arraySymmetry.length; j++) {
                System.out.print("introduzca el dato de la posicion "+i+"."+j+": ");
                arraySymmetry[i][j] = sc.nextInt();
            }
        }
        System.out.println("");

        for(int i = 0; i<arraySymmetry.length; i++) {
            for(int j = 0; j<arraySymmetry.length; j++) {
                if(arraySymmetry[i][j]==arraySymmetry[j][i]) {
                    counter++;
                }
            }
        }
        if(counter==16) {
            System.out.println("El array es simetrico");
        } else {
            System.out.println("El array no es simetrico");
        }
    }
}
