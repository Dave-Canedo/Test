import java.util.Scanner;
public class T6 {
    public static void main(String[] args) {
// Pedir el día, mes, año de una fecha y mostrar la fecha del día siguiente (Suponer que todos los meses tienen 30).
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca dia, mes y anio");

        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        if(d>=1 && d<=30 && m>=1 && m<=12) {
            d++;
            if(d>30) {
                d=1;
                m++;
                if(m>12) {
                    y++;
                    m=1;
                }
            }
            System.out.println(d+"/"+m+"/"+y);
        } else {
            System.out.println("fecha inexistente");
        }
    }
}
