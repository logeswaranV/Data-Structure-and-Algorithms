// Kadane's Algorithm to find the maximum subarray sum in an array.

import java.util.ArrayList;
import java.util.List;

public class KadaneAlgorithm {
    
    public static int maxSubArraySum(int[] arr) {

        List<Integer> results = new ArrayList<>();
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            results.add(arr[i]);
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
                results.clear();
            }
        }
        if (maxSum < 0) maxSum = 0;
        System.out.println("Results array: " + results);
        return maxSum;
    }
        public static void main(String[] args) {
        int[] arr = {10, 20, -40, 60, -50, 60};
        System.out.println("Maximum subarray sum is: " + maxSubArraySum(arr));
    }
}
