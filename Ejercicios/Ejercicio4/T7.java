package Ejercicios.Ejercicio4;
import java.util.Scanner;
public class T7 {
    public static void main(String[] args) {
        
        // Pedir el dia, mes, año de una fecha e indicar si la fecha es correcta (Tomar en cuenta fechas reales, tomar en cuenta años bisiestos).

        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca dia, mes, anio");

        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        boolean esvalido = false;

        if(m>=1 && m<=12) {
            if(d>=1 && d<=31) {
                if(m==4 || m==6 || m==9 || m==11) {
                    esvalido = d<=30;
                } else if(m==2) {
                    if(y%4==0 && y%100!=0 || y%400==0) {
                        esvalido = d<=29;
                    } else {
                        esvalido = d<=28;
                    }
                } else {
                    esvalido = true;
                }
            } 
        }
        if(m==4 || m==6 || m==9 || m==11) {
            if(d>30) {
                d=1;
                m++;
            }
        } else if(m==2) {
            if(y%4==0 && (y%100!=0 || y%400==0)) {
                if(d>29) {
                    d=1;
                    m++;

                } else {
                    if(d>28) {
                        d=1;
                        m++;
                    }
                }
            } if(m>12) {
                m=1;
                y++;

                System.out.println(d+"/"+m+"/"+y);
            }
        }      
    } 
            
}
    

