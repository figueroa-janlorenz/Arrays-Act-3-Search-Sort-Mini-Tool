package search.sort.mini.tool;
import java.util.Arrays;


public class SearchSortMiniTool {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88, 75, 95, 80};
        int target = 92;
        boolean found = false;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                System.out.println(target + " was found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(target + " was not found.");
        }

        // sorting a copy in order to make the original scores stay the same.
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        System.out.println("Original Array: " + Arrays.toString(scores));
        System.out.println("Sorted Array: " + Arrays.toString(sortedScores));
    }
    
}
