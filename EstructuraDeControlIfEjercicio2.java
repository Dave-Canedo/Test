import java.util.Scanner;

public class EstructuraDeControlIfEjercicio2 {
  public static void main(String[] args) {
    System.out.println("Introduzca un numero");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();

    // AND &&
    // OR ||
    // >=
    // <=
    // >
    // <
    // ==
    // !=
    // !
    
    if (num<=15 || num>=20) {
      System.out.println(num + " no está entre 15 y 20 (inclusivo)"); // No puede ser ni 16, ni 17, 18, ni 19
    } else {
      System.out.println(num + " está entre 15 y 20");
    }
    
  }
}
