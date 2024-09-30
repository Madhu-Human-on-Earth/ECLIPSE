package HashMap;
//
//import java.util.Arrays;
//
//public class LongestConsecutiveSequence {
//    public static void longestConsecutive(int[] nums) {
//        if (nums.length == 0)
//            return;
//
//        Arrays.sort(nums);
//        int currentSequence = 1;
//        int maxSequence = 1;
//        int start = 0;
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] - nums[i-1] == 1) {
//                currentSequence++;
//            } else if (nums[i] != nums[i-1]) {
//                currentSequence = 1;
//            }
//
//            if (currentSequence > maxSequence) {
//                maxSequence = currentSequence;
//                start = i - currentSequence + 1;
//            }
//        }
//
//        System.out.println("Longest consecutive sequence:");
//        for (int i = start; i < start + maxSequence; i++) {
//            System.out.println(nums[i]);
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {100, 4, 200, 1, 3, 2};
//        //longestConsecutive(nums);
//        int sol=longestConsecutive(nums);
//    }
//}

import java.util.ArrayList;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        ArrayList<Integer> output = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int val : arr) {
            set.add(val);
        }

        int maxStartPos = 0;
        int maxLength = 0;

        for (int val : arr) {
            if (!set.contains(val - 1)) {
                int currentLen = 1;
                int currentStart = val;

                while (set.contains(currentStart + currentLen)) {
                    currentLen++;
                }

                if (currentLen > maxLength) {
                    maxLength = currentLen;
                    maxStartPos = currentStart;
                }
            }
        }

        output.add(maxStartPos);
        output.add(maxStartPos + maxLength - 1);

        return output;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2, 5, 6};
        ArrayList<Integer> longestSeq = longestConsecutiveIncreasingSequence(arr);

        System.out.println("First element: " + longestSeq.get(0));
        System.out.println("Last element: " + longestSeq.get(1));
    }
}
