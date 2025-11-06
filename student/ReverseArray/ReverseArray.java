import java.util.*;


public class ReverseArray {
    public static Integer[] reverse(Integer[] arr) {
     List<Integer> list = Arrays.asList(arr);
     Collections.reverse(list);
     return arr;

    }
}