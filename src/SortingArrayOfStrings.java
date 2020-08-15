import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class cmp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer a = ((String) o1).length();
        Integer b = ((String) o2).length();
        return a.compareTo(b);
    }
}

public class SortingArrayOfStrings {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Quick", "Brown", "Fox", "Jumped", "Over"));
        System.out.println(list);
        list.sort(new cmp());
        System.out.println((list));
    }
}
