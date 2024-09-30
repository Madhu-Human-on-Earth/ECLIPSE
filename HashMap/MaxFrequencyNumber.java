package HashMap;

import java.util.HashMap;

public class MaxFrequencyNumber {
    public static void main(String[] args) {
        int[] arr = {2, 12, 2, 11, 12, 2, 1, 2, 2, 11, 12, 2, 6};
        getHashMap(arr);
    }

    private static void getHashMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int maxFreq = Integer.MIN_VALUE;
        int maxEle = 0;

        for (int i = 0; i < arr.length; i++) {
            int freq = map.get(arr[i]);
            System.out.println(arr[i] + " has a frequency of " + freq);

            if (freq > maxFreq) {
                maxFreq = freq;
                maxEle = arr[i];
            }
        }

        System.out.println("Element with the maximum frequency is: " + maxEle + " with a frequency of " + maxFreq);
    }
}
