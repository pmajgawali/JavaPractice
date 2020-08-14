import java.util.*;

public class VowelsAndConsonants {

    private static final Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static List<Integer> foo(String s) {
        List<Integer> list = new ArrayList<>(Collections.nCopies(2, 0));
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (vowels.contains(c)) list.set(0, list.get(0) + 1);
                else list.set(1, list.get(1) + 1);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        String s = "Hello World";

        List<Integer> list = foo(s);
        System.out.println(list);
    }
}
