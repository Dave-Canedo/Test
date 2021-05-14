public class close10 {
    public static void main(String[] args) {
        String a = "code";
        int n = 1;

        System.out.println(close10(a, n));

    }
    public static String close10(String word, int n) {
        for(int i = 0; i<word.length()-1; i++) {
            if(i==n) {
                word.substring(i) = word.substring(i+1, word.length());
            }
            return word;
        }
    }
    
}
