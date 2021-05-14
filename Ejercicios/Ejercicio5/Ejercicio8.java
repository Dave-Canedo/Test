package Ejercicios.Ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] Group1 = new int[12];
        int[] Group2 = new int[12];
        int[] Group3 = new int[24];

        int i1 = 0;
        int i2 = 0;

        System.out.println("introduzca los datos de Group1");

        for(int i = 0; i<12; i++) {

            System.out.println("introduzca el dato # "+(i+1));

            Group1[i] = sc.nextInt();
        }
        System.out.println("Introduzca los datos del Group2");

        for(int i = 0; i<12; i++) {

            System.out.println("introduzca el dato # "+(i+1));

            Group2[i] = sc.nextInt();
        }
        
        while(i2<12) {
            for(int i = 0; i<3; i++) {

                Group3[i1] = Group1[i2+i];

                i1++;
            }

            for(int i = 0; i<3; i++) {

                Group3[i1] = Group2[i2+1];

                i1++;
            }

            i2+=3;
        }
        System.out.println("los datos de los dos array mezclados son");

        for(int i = 1; i<=24; i++) {
            
            System.out.println(i);
        }
    }
}