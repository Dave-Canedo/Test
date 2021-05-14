import java.util.Scanner;
public class Ejercicio19 {
    static int sumaImpares(int numero) {
        int acumulador = 0;
        int contador = 0;
        int i = 0;

        while(contador<numero) { 
            if(i%2!=0) {
                acumulador = i+acumulador; 
                contador++; 
            } 
            i++; 
        }
        return acumulador;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca un numero");

        int number = sc.nextInt();

        int resultado = sumaImpares(number);

        System.out.println("la suma de los primeros "+number+" numeros impares es: "+resultado);

    }
}