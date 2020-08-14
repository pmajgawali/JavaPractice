import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JoinStrings {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("The", "Quick", "Brown", "fox"));
        char delimiter = '#';
        StringBuilder stringBuilder = new StringBuilder();

        for (String word : list) {
            stringBuilder.append(word).append(delimiter);
        }

        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        String ans = stringBuilder.toString();

        System.out.println(ans);
    }
}
