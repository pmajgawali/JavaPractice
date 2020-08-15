import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "abaade";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            map.compute(c, (k, v) -> v == null ? 1 : ++v);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                stringBuilder.append(c);
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
