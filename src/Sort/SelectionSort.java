package Sort;

import java.io.IOException;

public class SelectionSort {

    // 선택정렬

    public static void main(String[] args) throws IOException {

        int[] arr = {15, 17, 52, 10, 3, 49, 33};
        int n = arr.length;

        int start = 0;

        while (start < n - 1) {

            printArr("[pass 수행 전 ]", arr, -1, -1);
            int targetIndex = start;
            int targetValue = arr[start];
            for (int j = n - 1; j > start; j--) {
                if (targetValue > arr[j]) {
                    targetValue = arr[j];
                    targetIndex = j;
                }
            }
            printArr("[가장 작은 숫자]", arr, targetIndex, -1);
            swap(arr, start, targetIndex);
            start++;
            System.out.println();
        }
    }


    public static void swap(int[] arr, int a, int b) {

        int temp = 0;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        printArr("[swap 후 ]\t", arr, a, b);

    }

    public static void printArr(String msg, int[] arr, int a, int b) {
        System.out.printf(msg + "\t\t");
        for (int i = 0; i < arr.length; i++) {
            if (i == a || i == b) {
                System.out.printf("[%d] ", arr[i]);
                continue;
            }
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();

    }
}