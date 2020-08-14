import java.util.HashMap;
import java.util.Map;

public class dupicatecharacters {

    public static void main(String[] args) {
        String s = "Hello World";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            map.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }

        System.out.println(map);
    }

}
