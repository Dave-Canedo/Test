import java.util.Scanner;

public class uno {
    public static void main(String[] args) {
        System.out.println("introducir un numero del uno al diez");
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        //VERSION IF

        if(numero==1) {
            System.out.println(numero+ " es uno");
        }  else if(numero==2) {
            System.out.println(numero+ " es dos");
        } else if(numero==3) {
            System.out.println(numero+" es tres");
        } else if(numero==4) {
            System.out.println(numero+"es cuatro");
        } else if(numero==5) {
            System.out.println(numero+" es cinco");
        } else if(numero==6) {
            System.out.println(numero+" es seis");
        } else if(numero==7) {
            System.out.println(numero+" es siete");
        } else if(numero==8) {
            System.out.println(numero+" es ocho");
        } else if(numero==9) {
            System.out.println(numero+" es nueve");
        } else if(numero==10) {
            System.out.println(numero+" es diez");
        } else {
            System.out.println(numero+" no es ningun numero del uno al diez");

    
        }   

        // VERSION SWITCH

        switch(numero) {
            case 1:
                System.out.println(numero+" es uno");
                break;
            case 2:
                System.out.println(numero+" es dos");
                break;
            case 3:
                System.out.println(numero+" es tres");
                break;
            case 4:
                System.out.println(numero+" es cuatro");
                break;
            case 5:
                System.out.println(numero+" es cinco");
                break;
            case 6:
                System.out.println(numero+" es seis");
                break;
            case 7:
                System.out.println(numero+ " es siete");
                break;
            case 8:
                System.out.println(numero+" es ocho");
                break;
            case 9:
                System.out.println(numero+" es nueve");
                break;
            case 10:
                System.out.println(numero+" es diez");
                break;
                default:
                System.out.println(numero+" no corresponde");
        }
    }
    
}
// introducir un numero del 1 al 10 y mostrar su numero en literal