import java.util.Scanner;

public class EstructuraDeControlIfEjercicio {
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

    if (num>=10 && num<=15) {
      System.out.println(num + " está entre 10 y 15"); // 10, 11, 12, 13, 14, 15
    } else {
      System.out.println(num + " no está entre 10 y 15");
    }
    
  }
}
