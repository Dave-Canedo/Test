public class Ejercicio2 {
    public static  void main(String[] args) {

    // Disena una aplicacion que muestre la tabla de multiplicar del 1 al 10.

        for(int factor1 =1; factor1<=10; factor1++) {

            System.out.println(" ");

            System.out.println("Tabla del "+factor1);

            for(int factor2 =1; factor2<=10; factor2++) {

                System.out.println(factor1+" x "+factor2+" = "+(factor1*factor2));
            }
        }
    }
}
