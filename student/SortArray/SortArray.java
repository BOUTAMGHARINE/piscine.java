
import java.util.*;

public class SortArray {
    public static Integer[] sort(Integer[] args) {
        List<Integer> list = Arrays.asList(args);
        Collections.sort(list);
        return args;
    }
}