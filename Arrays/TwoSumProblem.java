// Two pointer approach left and right pointer on the opposite side.

public class TwoSumProblem {

    public static int[] twoSum(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else right--;
        }

        return new int[]{-1, -1};

    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 6;

        int[] result = twoSum(nums, target);

        System.err.println( "result" + ": " + result[0] + " | " + result[1]);
    }
        
        

}
