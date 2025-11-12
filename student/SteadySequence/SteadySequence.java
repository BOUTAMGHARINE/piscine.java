

import java.util.HashSet;
import java.util.Arrays;

public class SteadySequence {
    public int longestSequence(int[] nums) {
        // Implementation to find the length of the longest consecutive elements sequence
        if(nums.length == 0 || nums == null){
            return 0;
        }

        Arrays.sort(nums);
        int lastcount = 0;
        int count = 0;

        for (int i = 0; i< nums.length;i++) {
            int j = i+1;
            while (j < nums.length && (nums[j-1]+1 == nums[j] || nums[j-1] == nums[j])) {
              
                if (nums[j-1] !=  nums[j])   count++;
                  j++;
              

            }
            if (lastcount < count) {
                lastcount =count;
               
            }
             count = 0;
            


        }
        return lastcount+1;



    }
      public static void main(String[] args) {
        SteadySequence finder = new SteadySequence();

        // Test case 1
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence length: " + finder.longestSequence(nums1)); // Expected output: 4

        // Test case 2
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println("Longest consecutive sequence length: " + finder.longestSequence(nums2)); // Expected output: 9

        // Test case 3
        int[] nums3 = {1, 2, 0, 1};
        System.out.println("Longest consecutive sequence length: " + finder.longestSequence(nums3)); // Expected output: 3
    }
}
//5
//9
//3