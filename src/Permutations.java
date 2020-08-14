import java.util.ArrayList;
import java.util.List;

public class Permutations {

    private static void helper(StringBuilder stringBuilder, List<String> ans, int idx) {
        if (idx == stringBuilder.length()) {
            ans.add(stringBuilder.toString());
            return;
        }

        for (int i = idx; i < stringBuilder.length(); ++i) {
            char a = stringBuilder.charAt(i);
            stringBuilder.setCharAt(i, stringBuilder.charAt(idx));
            stringBuilder.setCharAt(idx, a);

            helper(stringBuilder, ans, idx + 1);

            stringBuilder.setCharAt(idx, stringBuilder.charAt(i));
            stringBuilder.setCharAt(i, a);
        }
    }

    public static List<String> foo(String s) {
        List<String> ans = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder(s);
        int idx = 0;

        helper(stringBuilder, ans, idx);

        return ans;
    }

    public static void main(String[] args) {
        String my = "abc";

        List<String> list = foo(my);
        System.out.println(list);
        System.out.println(list.size());
    }
}
