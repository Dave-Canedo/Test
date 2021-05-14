public class BucleWhile {
    public static void main(String[] args) {
        int numero =0;                                       
        int numero2 =0;

        while (numero<5) {
            System.out.println("hola "+numero);

            if(numero==3) {
                break;
            }

            numero+=1;
        }

        while(numero2 <5) {
            System.out.println("ciao "+numero2);
            numero2++;

            if(numero2 ==1) {
                continue;
            }

            System.out.println("xxx");

        }
    }
}
