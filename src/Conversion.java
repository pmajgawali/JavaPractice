public class Conversion {

    private static final String TO_INT = "453";
    private static final String TO_LONG = "4538295025";
    private static final String TO_FLOAT = "45.3";
    private static final String TO_DOUBLE = "525.22222";

    public static void main(String[] args) {
        int my_int = Integer.parseInt(TO_INT);
        long my_long = Long.parseLong(TO_LONG);
        float my_float = Float.parseFloat(TO_FLOAT);
        double my_double = Double.parseDouble(TO_DOUBLE);

        System.out.println(my_int);
        System.out.println(my_long);
        System.out.println(my_float);
        System.out.println(my_double);

        String bad = "123DER";

        try {
            int d = Integer.parseInt(bad);
            System.out.println(d);
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
    }
}
