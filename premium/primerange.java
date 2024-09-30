package premium;

import java.util.Arrays;

//Sieve Of Eratosthenes Algo
public class primerange {
    public static void main(String[] args) {
        int n = 36;
        boolean[] sol = findrange(n);
        
        // Printing the prime numbers
        for (int i = 2; i <= n; i++) {
            if (sol[i]) {
                System.out.print(i + " ");
            }
        }
    }
    //o(n*log(log(n))
    //o(n)

    private static boolean[] findrange(int n) {
        boolean[] arr = new boolean[n + 1];

        Arrays.fill(arr, true);

        for (int i = 2; i * i <= arr.length; i++) {
            if (arr[i] == true) {
                for (int j = i + i; j < arr.length; j += i) {
                    arr[j] = false;
                }
            }
        }
        return arr;
    }
}
