public class LongestCommonPrefix {
    public static String lcp(String a, String b) {
        int end = 0;

        while (end < a.length() && end < b.length()) {
            if (a.charAt(end) == b.charAt(end)) {
                ++end;
            } else {
                break;
            }
        }

        return a.substring(0, end);
    }

    public static void main(String[] args) {
        String[] strings = {"bank", "bangkok", "banana", "banner"};

        String tmp = lcp(strings[0], strings[1]);

        for (int i = 2; i < strings.length; ++i) {
            tmp = lcp(tmp, strings[i]);
        }

        System.out.println(tmp);
    }
}
