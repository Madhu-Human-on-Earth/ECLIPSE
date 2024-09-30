import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int[][] input = {
                {1, 1, 2}, {1, 2, 1}, {1, 1, 2}, {1, 2, 1}, {2, 1, 1}, {2, 1, 1}
        };

        HashSet<List<Integer>> set = new HashSet<>();

        for (int[] arr : input) {
            List<Integer> list = Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));
            set.add(list);
        }

        List<List<Integer>> output = new ArrayList<>(set);

        int[][] result = new int[output.size()][];
        for (int i = 0; i < output.size(); i++) {
            List<Integer> sublist = output.get(i);
            result[i] = sublist.stream().mapToInt(Integer::intValue).toArray();
        }

        System.out.println(Arrays.deepToString(result));
    }
}
