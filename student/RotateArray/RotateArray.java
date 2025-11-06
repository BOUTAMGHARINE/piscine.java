
import java.util.*;


public class RotateArray {
    // public static Integer[] rotate(Integer[] arr, int rotationCount) {
    //     List<Integer> list = Arrays.asList(arr);
    //     Collections.rotate(list, rotationCount);
    //     return arr;
    // }
    //   public static void main(String[] args) throws IOException {
    //     System.out.println(Arrays.toString(RotateArray.rotate(new Integer[]{4, 2, 1, 3}, 1)));
    // }

      public static Integer[] rotate(Integer[] arr, int rotationCount) {
        List<Integer> list = Arrays.asList(arr);
        Collections.rotate(list,rotationCount);
        return arr;
   
     
     }


}

  

//  [4 , 8 , 9 ,10]