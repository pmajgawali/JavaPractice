import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeated {

    private static Character foo(String s) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            if (set.contains(c)) return c;

            set.add(c);
        }

        return null;
    }

    public static void main(String[] args) {
        String s = "Hello World";

        System.out.println(foo(s));

    }
}
