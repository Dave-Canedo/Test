public class Ejercicio5 {
    // Hacer una función que retorne el área y el volumen de un cilindro en un array, área en la posición 0, y volumen en la posición 1.
    static float[] areaandVolumen(float radio, float height) {

        float[] ayv = new float [2];
        float pi = (float)Math.PI;

        float preSolution = 0.0f;

        preSolution = 2*pi*radio;
        ayv[0] = preSolution*(height+radio);

        preSolution = pi*radio*height;
        ayv[1] = preSolution*radio;

        return ayv;
    }
    public static void main(String[] args) {
        float radio = 2.0f;
        float height = 5.0f;

        float[] solution = areaandVolumen(radio, height);

        for(int i = 0; i<solution.length; i++) {
            System.out.print(solution[i]+", ");
        }
    }
}