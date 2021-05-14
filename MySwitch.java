public class MySwitch {
    public static void main(String[] args) {
        int num =3+4;

        switch(num) {
            case 2:
                System.out.println("es dos");
                break; //break sirve para que se ejecute hasta ahi
            case 3:
                System.out.println("es tres");
                break;
            case 4:
                System.out.println("es cuatro");
                break;
            case -1:
            case -2:
                System.out.println("es menos uno o menos 2");
                break;
                default:// default sirve para imprimir de todas formas
                System.out.println("no se cumplio");    

        }
    }
    
}
