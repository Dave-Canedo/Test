import java.util.Scanner;
public class T8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introducir hh, mm, ss");

        //  Pedir una hora de la forma HH:mm:ss y mostrar la hora en el segundo siguiente. 
        // Ej: si el usuario introduce: 15:59:59 -> el programa debe mostrar 16:00:00
        //si el usuario introduce: 01:45:58 -> el programa debe mostrar 01:45:59


        int HH = sc.nextInt();
        int MM = sc.nextInt();
        int SS = sc.nextInt();

            if(HH<=23 && HH>=0 && MM>=0 && MM<=59 && SS>=0 && SS<59) {
                SS++;
                System.out.println(HH+":"+MM+":"+SS);
            } else {
                if(HH==23 && MM==59 && SS==59) {
                    HH = HH/24;
                    MM = MM/60;
                    SS = SS/60;
                    System.out.println(HH+":"+MM+":"+SS);
                } else {
                    if(HH<23 && MM==59 && SS==59) {
                        HH++;
                        MM = MM/60;
                        SS = SS/60;
                        System.out.println(HH+":"+MM+":"+SS);
                    } else {
                        if(HH<=23 &&  MM<59 && SS == 59) {
                            MM++;
                            SS= SS/60;
                            System.out.println(HH+":"+MM+":"+SS);
                        } else {
                            System.out.println("Hora inexistente");
                        }
                    }
                }
            }
    }
} 