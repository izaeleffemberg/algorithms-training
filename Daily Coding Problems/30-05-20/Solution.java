import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Solution {
    public static void main (final String[] args) {
        final Integer[] numbers = new Integer[] { 10, 15, 3, 7 };
        final int k = 17;
        System.out.println(solution(numbers, k));
    }

    // Time complexity: O(n)
    // Space complexity: O(n)
    // Data Structures that was used: Set
    private static boolean solution(final Integer[] numbers, final int k) {
        Set<Integer> numbersSet = new HashSet<Integer>(Arrays.stream(numbers).collect(Collectors.toSet()));
        for (final int number : numbers) {
            final Integer complement = k - number;
            if (numbersSet.contains(complement)) return true;
        }
        return false;
    }
}