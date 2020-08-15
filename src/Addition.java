public class Addition {
    public static void main(String[] args) {
        long a = Long.MAX_VALUE;
        long b = Long.MAX_VALUE;
        try {
            long c = Math.addExact(a, b);
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }

    }
}
