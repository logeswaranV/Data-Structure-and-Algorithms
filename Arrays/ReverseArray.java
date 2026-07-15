import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));

        int[] reversedArr = reverseArray(arr);
        System.out.println("Reversed Array: ");
        System.out.println(Arrays.toString(reversedArr));
    }
}
