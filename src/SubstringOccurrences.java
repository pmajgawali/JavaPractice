import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubstringOccurrences {

    public static void main(String[] args) {
        String substring = "pen";
        String sentence = "apple_pen_pineapple_pen_pen_pineapple_apple_pen";

        String p = substring + "$" + sentence;

        List<Integer> prefix = new ArrayList<>(Collections.nCopies(p.length(), 0));

        int border = 0;
        for (int i = substring.length() + 1; i < prefix.size(); ++i) {

            while (border > 0 && p.charAt(border) != p.charAt(i)) {
                border = prefix.get(border);
            }

            if (p.charAt(border) == p.charAt(i)) {
                ++border;
            } else {
                border = 0;
            }
            prefix.set(i, border);

        }
        int ans = 0;
        for (int num : prefix) {
            if (num == substring.length()) {
                ++ans;
            }
        }

        System.out.println(ans);
    }
}
