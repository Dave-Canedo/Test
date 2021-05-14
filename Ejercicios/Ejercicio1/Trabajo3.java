
import java.util.Scanner;

public class Trabajo3 {
    public static void main(String[] args){
        System.out.println("introducir un numero entero del 0 al 99");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int u = x%10;
        int d = x/10;
        

        switch(d) {

            case 0 :
                System.out.println("cero decenas ");
                break;
            case 1:
                System.out.println("una decena ");
                break;
            case 2:
                System.out.println("dos decenas ");
                break;
            case 3:
                System.out.println("tres decenas ");
                break;
            case 4:
                System.out.println("cuatro decenas ");
                break;
            case 5:
                System.out.println("cinco decenas ");
                break;
            case 6:
                System.out.println("seis decenas ");
                break;
            case 7:
                System.out.println(" siete decenas ");
                break;
            case 8:
                System.out.println("ocho decenas ");
                break;
            case 9:
                System.out.println("nueve decenas ");
                break;
                default:
                System.out.println(" no corresponde");
                break;
        }

        switch(u) {
            case 0:
                System.out.println("cero unidades");
                break;
            case 1:
                System.out.println("una unidad");
                break;
            case 2:
                System.out.println("dos unidades");
                break;
            case 3:
                System.out.println("tres unidades");
                break;
            case 4:
                System.out.println("cuatro unidades");
                break;
            case 5:
                System.out.println("cinco unidades");
                break;
            case 6:
                System.out.println("seis unidades");
                break;
            case 7:
                System.out.println("siete unidades");
                break;
            case 8:
                System.out.println("ocho unidades");
                break;
            case 9:
                System.out.println(" nueve unidades");
                break;
            default:
                System.out.println(" ");
                break;
        }
    }
}
// Hacer un programa que pida un numero del 0-99 y mostrar el número de decenas y el número de unidades en formato literal.
//Ej:-> 84 ocho cuatro -Sólo con switch.
