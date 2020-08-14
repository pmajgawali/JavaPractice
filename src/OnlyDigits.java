public class OnlyDigits {

    public static boolean foo(String s) {
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "12345";
        String b = "123-4-a";

        System.out.println(foo(s));
        System.out.println(foo(b));
    }
}
