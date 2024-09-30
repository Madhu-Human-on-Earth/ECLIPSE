package premium;

import java.util.HashMap;

public class Majorityele01 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 1, 1, 6, 1, 1};
        int sol = majority(arr);
        System.out.println(sol);
    }

    private static int majority(int[] arr) {
        // Using HashMap to count frequencies of elements
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int maxF = 0;
        int majorityElement = -1;
        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (frequency > maxF) {
                maxF = frequency;
                majorityElement = key;
            }
        }

        // Check if the majority element is indeed a majority
        if (maxF > arr.length / 2) {
            return majorityElement;
        } else {
            return -1; // Return -1 if there is no majority element
        }
    



//      
//    	int val=arr[0];
//    	int c=1;
//    	for(int i=1;i<arr.length;i++) {
//    		if(val==arr[i]) {
//    			c++;
//    		}else {
//    			c--;
//    		}
//    		if(c==0) {
//    			val=arr[i];
//    			c=1;
//    		}
//    	}
//
//        return val; // Return -1 if there is no majority element
    }
}
