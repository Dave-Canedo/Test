package Clases;

public class Arrays {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        // Arreglo o Array se puede guardar mas de un dato, en este caso 3 

        myArray[0] = 5;
        myArray[1] = 3;
        myArray[2] = 7;
        // en caso vde que se tenga varios datos para introcir,  se puede  pueutlizar un bucle, en este caso for

        for( int i = 0; i<3; i++ ) {
            myArray[i] = myArray[i] *2; // i se multiplica por 2 si se ejecuta...

        System.out.println("la posicicion"+ i+"tiene valor"+" "+myArray[i]);
        }
    }
}
