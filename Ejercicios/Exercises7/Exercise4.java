import java.util.Scanner;
public class Exercise4 {
    // Transponer un array bidimensional
    public static void main(String[] args) {
        int[][] arrayTransposition = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<arrayTransposition.length; i++) {
            for(int j = 0; j<arrayTransposition.length; j++) {
                System.out.print("introduzca el valor de la posicion "+i+"."+j+": ");

                arrayTransposition[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<arrayTransposition.length; i++) {
            for(int j = 0; j<arrayTransposition.length; j++) {
                System.out.print(arrayTransposition[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("FORMA TRANSPUESTA");

        for(int j = 0; j<arrayTransposition.length; j++) {
            for(int i = 0; i<arrayTransposition.length; i++) {
                System.out.print(arrayTransposition[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
