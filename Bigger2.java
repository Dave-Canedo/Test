public class Bigger2 {
    public static void main(String[] args) {
        int a = 34;
        int b = 20;

        if(bigger2(a, b)) {
            System.out.println("verdadero");
        } else {
            System.out.println("falso");
        }
    }
    public static boolean bigger2(int n1, int n2) {
        if((n1-n2)>=2) {
            return true;
        }
        return false;
    }
}
