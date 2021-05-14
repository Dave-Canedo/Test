import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
// Leer los datos correspondiente a dos arrays de 12 elementos numéricos, y mezclarlos en una tercera de la forma: 3 de la array A, 3 de la B, otros 3 de A, otros 3 de la B, etc.

        Scanner sc = new Scanner(System.in);

        int[] group1 = new int[12];
        int[] group2 = new int[12];
        int[] group3 = new int[24];

        int i1 = 0;
        int i2 = 0;

        System.out.println("introduzca los datos de Group1");

        for(int i = 0; i<12; i++) {

            System.out.println("introduzca el dato # "+(i+1));

            group1[i] = sc.nextInt();
        }
        System.out.println("Introduzca los datos del Group2");

        for(int i = 0; i<12; i++) {

            System.out.println("introduzca el dato # "+(i+1));

            group2[i] = sc.nextInt();
        }
        
        while(i2<12) {
            for(int i = 0; i<3; i++) {

                group3[i1] = group1[i2+i];

                i1++;
            }

            for(int i = 0; i<3; i++) {

                group3[i1] = group2[i2+i];

                i1++;
            }

            i2+=3;
        }
        System.out.println("los datos de los dos array mezclados son");

        for(i1 = 0; i1<24; i1++) {
            
            System.out.print(group3[i1]+", ");
        }
    }
}