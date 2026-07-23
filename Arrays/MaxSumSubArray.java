// Sliding window approach to find the maximum sum of a subarray of size k.

public class MaxSumSubArray {

    public static int maxSubArraySum(int[] arr, int k) {

        int firstSum = 0;

        for (int i = 0; i < k; i++) {
            firstSum += arr[i];
        }

        int maxSum = firstSum;

        for (int i = k; i < arr.length; i++) {
            firstSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, firstSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, -40, 60, -50, 60};
        int maxSum = maxSubArraySum(arr, 3);
        System.out.println("Maximum subarray sum is: " + maxSum);
    }
    
}
