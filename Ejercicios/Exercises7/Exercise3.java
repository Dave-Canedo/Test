import java.util.Scanner;
public class Exercise3 {
    //Crear y cargar dos arrays de tamano 3x3 , sumarlos y mostrar el resultado. 
    public static void main(String[] args) {
        int[][] sumArrays1 = new int[3][3];
        int[][] sumArrays2 = new int[3][3];
        int[][] sumArrays3 = new int[3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("introduzca los datos del primer Array");

        for(int i = 0; i<sumArrays1.length; i++) {
            for(int j = 0; j<sumArrays1.length; j++) {
                System.out.print("introduzca el dato para la posicion"+i+"."+j+": ");

                sumArrays1[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
        System.out.println("introduza los datos del segundo array");

        for(int i = 0; i<sumArrays2.length; i++) {
            for(int j = 0; j<sumArrays2.length; j++) {
                System.out.print("introduzca el dato para la posicion "+i+"."+j+": ");

                sumArrays2[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
        System.out.println("La suma de los dos arrays, lanzan los siguientes resultados:");

        for(int i = 0; i<sumArrays3.length; i++) {
            for(int j = 0; j<sumArrays3.length; j++) {

                sumArrays3[i][j] = sumArrays2[i][j]+sumArrays1[i][j];

                System.out.println(sumArrays1[i][j]+" + "+sumArrays2[i][j]+" = "+sumArrays3[i][j]);
            }
        }

    }
}
