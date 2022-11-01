package Leetcode;
import java.util.*;
public class CombinationSum_BackTracking {
    /**
 * Since this question allows same number to be used unlimited times, candidates
 * array cannot have zero and negative numbers. As it will lead to infinite
 * number of combinations. For example: candidates = [-1, 0, 1] and target = 1.
 * This case will result in infinite solutions if same number can be used
 * multiple times.
 *
 * Time Complexity:
 * This problem can be converted to Combination Sum II. For example, candidates = [2,3,5,6] and target = 12.
 * Then we can create an array = [2,2,2,2,2,2, 3,3,3,3, 5,5, 6,6].
 * Now from this array we can use each number only once in the combination.
 * Therefore total number of elements in this array N' equal to floor(T/n1) + floor(T/n2) + ... + floor(T/nN)
 *
 * 1. The length of the potential combinations can vary from 1 to k where k = T/M.
 * 2. Total number of combinations of size k is C(N',k) and time to add each such combination in the result list is O(K).
 * Therefore the total time complexity will be O(1*C(N',1) + 2*C(N',2) + ... + k*C(N',k))
 *                                             = (i = 1 -> k) ∑ (i * C(N', i)).
 * If k = N', then above time complexity becomes O(N' * 2^(N'-1))
 *
 * Space Complexity: O(T/M) -> This is used by recursion stack and temp list.
 *
 * N = Length of input array. T = Target. M = Minimum value in the input array.
 */
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (candidates == null || candidates.length == 0 || target <= 0) {
            return result;
        }

        combinationSumHelper(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    private void combinationSumHelper(int[] candidates, int start, int target, List<Integer> tempList, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                continue;
            }
            tempList.add(candidates[i]);
            combinationSumHelper(candidates, i, target - candidates[i], tempList, result);
            tempList.remove(tempList.size() - 1);
        }
    }
}

//Backtracking - With Early Exit optimization

/**
 * In this solution we are sorting the input array, which allows us to early
 * exit from the recursion if the current number is greater than the remaining
 * target.
 *
 * Time & Space Complexity explanation is same as above. We will only need to
 * the time and space required for the sorting.
 */
public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    if (candidates == null || candidates.length == 0 || target <= 0) {
        return result;
    }
    // Only benefit of sorting is that we can break early in the recursion if the
    // current number is greater than the remaining target.
    Arrays.sort(candidates);
    combinationSumHelper(candidates, 0, target, new ArrayList<>(), result);
    return result;
}

private void combinationSumHelper(int[] candidates, int start, int target, List<Integer> tempList, List<List<Integer>> result) {
    if (target == 0) {
        result.add(new ArrayList<>(tempList));
        return;
    }

    for (int i = start; i < candidates.length; i++) {
        if (candidates[i] > target) {
            break;
        }
        tempList.add(candidates[i]);
        combinationSumHelper(candidates, i, target - candidates[i], tempList, result);
        tempList.remove(tempList.size() - 1);
    }
}
}
