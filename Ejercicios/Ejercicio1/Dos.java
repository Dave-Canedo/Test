import java.util.Scanner;

public class Dos {
    public static void main(String[] args) {
        System.out.println("introducir un numero de uno al diez");
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if(numero>=0 && numero<=4) {
            System.out.println("insuficiente");  
    } else if(numero==5) {
            System.out.println("suficiente");
    } else if(numero==6) {
            System.out.println("bien");
    } else if(numero>=7 && numero<=8) {
            System.out.println("notable");
    } else if(numero>=9 && numero<=10) {
            System.out.println("sobresaliente");
    } else {
            System.out.println("error");
    }

    //VERSION SWITCH

        switch(numero) {
            case 0, 1, 2, 3, 4:
                System.out.println("insuficiente");
                break;
            case 5:
                System.out.println("suficiente");
                break;
            case 6:
                System.out.println("bien");
                break;
            case 7, 8:
                System.out.println("notable");
                break;
            case 9, 10:
                System.out.println("sobresaliente");
                break;
                default:
                System.out.println("error");
        }
    }
    
}
// introducir notas de alumno del 0 al 10. En base a la nota introducida el programa debe imprimir un mensaje:
//- INSUFICIENTE (0 - 4).
//- SUFICIENTE (5).
//- BIEN (6).
//- NOTABLE (7 y 8).
//- SOBRESALIENTE (9 y 10).
//- ERROR

//No se debe repetir la misma linea de código.
//En version if/else y switch