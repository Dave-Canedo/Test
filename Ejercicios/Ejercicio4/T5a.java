import java.util.Scanner;
public class T5a {
    public static void main(String[] args) {
        // Pedir 10 numeros, mostrar la media de los numeros positivos y la media de los numero negativos y la cantidad de ceros. (for).

        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca diez numeros");

            int positivos = 0;
            int negativos = 0;
            int ceros = 0;
            int sumaPositivos = 0;
            int sumaNegativos = 0;

        for(int contador = 1; contador<=10; contador++ ) {

            int numero = sc.nextInt();

            if(numero>0) {
              positivos++;
              sumaPositivos+=numero;

            } else if (numero==0) {
                ceros++;
            } else {
                negativos++;
                sumaNegativos+=numero;   
            }
        }

        System.out.println("la media de los numeros positivos es: "+(float)sumaPositivos/positivos);
        System.out.println("la media de los numeros negativos es: "+(float)sumaNegativos/negativos);
        System.out.println("el # de ceros ingresados es: "+ceros);
    }
    
}