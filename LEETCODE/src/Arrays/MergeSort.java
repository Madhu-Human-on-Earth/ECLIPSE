package Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {2, 1, 7, 4, 9, 8, 88, 65, 34};
        int l = 0;
        int r = arr.length - 1; // Corrected the upper bound
        mergesortarray(arr, l, r);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void mergesortarray(int[] arr, int l, int r) {
        if (l < r) { // Changed while to if
            int mid = l + (r - l) / 2;
            mergesortarray(arr, l, mid);
            mergesortarray(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int lr = mid - l + 1;
        int rr = r - mid;

        int[] L = new int[lr];
        int[] R = new int[rr];

        for (int i = 0; i < lr; i++) {
            L[i] = arr[l + i]; // Corrected indices
        }

        for (int j = 0; j < rr; j++) {
            R[j] = arr[mid + 1 + j]; // Corrected indices
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < lr && j < rr) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < lr) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < rr) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
