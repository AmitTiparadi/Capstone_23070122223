// cctv footage rotation ...
// a security office stores the last few camera snapshots in an array
// [101,102,103,104,105, 106] 6 snapshots
// k = 3
// after rotation, the array should look like this
// [104,105,106,101,102,103]

public class RotatingArray {
    public static void main(String[] args) {
        int[] arr = {101,102,103,104,105,106};
        int k = 3;
        rotateArray(arr, k);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        reverse(arr, 0, n - 1); // Reverse the entire array
        reverse(arr, 0, k - 1); // Reverse the first k elements
        reverse(arr, k, n - 1); // Reverse the remaining elements
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

