import java.util.HashMap;
import java.util.Map;

public class CheckAnagrams {

    public static void main(String[] args) {
        String a = "pan";
        String b = "abc";

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < a.length(); ++i) {
            map1.compute(a.charAt(i), (k, v) -> (v == null) ? 1 : ++v);
        }

        for (int i = 0; i < b.length(); ++i) {
            map2.compute(b.charAt(i), (k, v) -> (v == null) ? 1 : ++v);
        }

        boolean isAnagram = true;
        if (map1.size() != map2.size()) {
            isAnagram = false;
        } else {
            for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
                if (map2.get(entry.getKey()) != entry.getValue()) {
                    isAnagram = false;
                    break;
                }
            }
        }


        System.out.println(isAnagram);


    }

}
