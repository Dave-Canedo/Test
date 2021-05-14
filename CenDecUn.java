import java.util.Scanner;
public class CenDecUn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introducir un numero del 101 al 999");

        int x = sc.nextInt();

        int u = x%10;
        int d = x/10;
        int c = x/100;

        switch(c) {

            case 0:
                System.out.println("uno");
                break;
            case 1:
                System.out.println(x+"tres centenas");
                break;
            case 2:
                System.out.println("tres");
                break;
            case 3:
                System.out.println("una centena");
                break;
            case 4:
                System.out.println("cuatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("siete");
                break;
            case 8:
                System.out.println("ocho");
                break;
            case 9:
                System.out.println("nueve");
                break;
        }
    }
    
}