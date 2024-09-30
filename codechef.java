import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            int[] A = new int[X * Y];
            for (int i = 0; i < X; i++) {
                for (int j = 0; j < Y; j++) {
                    A[i * Y + j] = scanner.nextInt();
                }
            }

            int mAXIMDiff = findMaxDiffValue(A, X, Y);
            System.out.println(mAXIMDiff);
        }
    }

    public static int findMaxDiffValue(int[] A, int X, int Y) {
        int maxIMDiff = Integer.MIN_VALUE;
        for (int i = 0; i < X; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < Y; j++) {
                int current = A[i * Y + j];
                min = Math.min(min, current);
                max = Math.max(max, current);
            }
            int diff = max - min;
            maxIMDiff = Math.max(maxIMDiff, diff);
        }
        return maxIMDiff;
    }
}
