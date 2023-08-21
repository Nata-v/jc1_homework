package part7.task32;

public class LinesPlus {
    private static final String Str = "aaabbbccc";

    public static String stringConcatenation() {
        String s = Str;
        for (int i = 0; i < 1000_000; i++) {
            s += Str;
        }
        return s;
    }

    public static String stringBufferConcatenation() {
        StringBuilder sb = new StringBuilder(Str);
        for (int i = 0; i < 1000_000; i++) {
            sb.append(Str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        stringConcatenation();
        long end = System.nanoTime();
        System.out.println("The time taken by string concatenation: " + (end - start) + "ns");
        start = System.nanoTime();
        stringBufferConcatenation();
        end = System.nanoTime();
        System.out.println("The time taken by StringBuilder concatenation: " + (end - start) + "ns");
    }
}
