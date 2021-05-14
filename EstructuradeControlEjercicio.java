import java.util.Scanner;

public class EstructuradeControlEjercicio {
    public static void main(String [] args) {
        
        System.out.println("pedir un numero");

        Scanner sc = new Scanner(System.in);

        int numer = sc.nextInt();

        System.out.println(numer);

        // si es 1 que la consolamuestre ese numero mas 2
        // si es menor a 5  mostrar el numero dividido entre 2
        // o si es > o = a 5 que multiplique por 2

        if(numer ==1) {
            System.out.println(numer+2);
        } else if(numer<5) {
            System.out.println(numer/2);
        } else if(numer>=5) {
            System.out.println(numer*2);
        }

        
    }
}
    
