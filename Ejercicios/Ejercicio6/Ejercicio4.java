
public class Ejercicio4 {
    // Hacer una función que retorne el área o el volumen de un cilindro (según se especifique mediante un parámetro de tipo char).
    public static float volumenorArea(char volumenorArea, float radio, float height) {

        float pi = 3.1416f;
        float preSolution = 0f;
        float solution = 0f;
       
       if(volumenorArea == 'v') {
           preSolution = pi*radio*radio;
           solution = preSolution* height;

       } else if(volumenorArea == 'a') {
           preSolution = 2*pi*radio;
           solution = preSolution*(height+radio);
       }
        return solution;
    }
    public static void main(String[] args) {

        char volumenorArea = 'v';
        float height = 20f;
        float radio = 10f;
    
        float solution = volumenorArea(volumenorArea, radio, height);

        if(volumenorArea == 'v') {
             System.out.print("el volumen del cilindro es "+solution+" cm3");
        } else if(volumenorArea == 'a') {
            System.out.print("el area del cilindro es: "+solution+" cm2");
        }

       
    }
}