import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introducir un numero del 0 al 99999");

        int x = sc.nextInt();
        int a = x/1;
        int b = x/10;
        int c = x/100;
        int d = x/1000;
        int e = x/10000;

        switch(a) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(x+" tiene un digito");
                break;
        }

        switch(b) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(x+" tiene 2 digitos");
                break;
        }

        switch(c) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(x+" tiene 3 digitos");
                break;
        }

        switch(d) {
            
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(x+" tiene 4 digitos");
                break;
        }

        switch(e) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(x+" tiene 5 digitos");
                break;
        }
    }
}

//Pedir un numero entre 0 y 99999 y decir cuantas cifras tiene.