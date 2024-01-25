import java.util.Collections;

class Solution {
    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
        }
    }

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr, 0, 4, Collections.reverseOrder());
        printArr(arr);

    }
}