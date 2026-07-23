// Two pointers Approach

import java.util.Arrays;

public class MovingZeros {

    public static int[] moveZeros(int[] arr) {

        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            System.out.println("pass" + right + ": " + Arrays.toString(arr));
            if (arr[right] == 0) continue;
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
        }

        return arr;
    }
    
    public static void main(String[] args) {
        
        int[] arr = {0, 1, 0, 0, 2, 3};
        
        int[] result = moveZeros(arr);

        System.out.println(Arrays.toString(result));
    }
}
