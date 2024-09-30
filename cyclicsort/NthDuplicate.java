package cyclicsort;

import java.util.NoSuchElementException;

public class NthDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5};
        int n = 2;
        int nthDuplicate = findNthDuplicate(arr, n);
        if (nthDuplicate != -1) {
            System.out.println("The " + n + "th duplicate is: " + nthDuplicate);
        } else {
            throw new NoSuchElementException("The " + n + "th duplicate was not found.");
        }
    }
    public static int findNthDuplicate(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = Math.abs(arr[i]) - 1;
            if (arr[j] < 0) {
                count++;
                if (count == n) {
                    return j + 1;
                }
            } else {
                arr[j] = -arr[j];
            }
        }
        return -1;
    }
}
