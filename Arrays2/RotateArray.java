package Arrays2;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 11, 12, 17};
        int d = 4;
        int n = arr.length;
        if (n == 0 || d == 0) {
            return; // nothing to rotate
        }
        d = d % arr.length; // handle case where d > n

        rotateArray(arr, d);

        // print the rotated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        if (n == 0 || d == 0) {
            return; // nothing to rotate
        }

        d = d % n; // handle case where d > n

        reverse(arr, 0, d-1);       // reverse the first d elements
        reverse(arr, d, n-1);       // reverse the remaining elements
        reverse(arr, 0, n-1);       // reverse the entire array
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

		
//o(n) ,o(n)
//		The space complexity of the code is also O(n), as the Deque is used to store all the elements of the input array.
//		Deque<Integer> deq = new ArrayDeque<>();
//		for (int i : inp) {
//			deq.add(i);
//		}
//
//		for (int i = 0; i < d; i++) {
//			int temp = deq.remove();
//			deq.addLast(temp);
//		}
//
//		System.out.println(deq);
		
		