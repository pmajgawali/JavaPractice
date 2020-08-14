public class ReverseLettersAndWords {

    public static String foo(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "Hello World";

        String[] words = s.split(" ");

        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            StringBuilder revWord = new StringBuilder(word);
            revWord.reverse();
            ans.append(revWord).append(" ");
        }

        System.out.println(ans.toString());
        System.out.println(foo(s));
    }
}
