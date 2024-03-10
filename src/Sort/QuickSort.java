package Sort;

import java.io.IOException;

public class QuickSort {
    // 퀵 정렬

    public static void main(String[] args) throws IOException {

        int[] arr = {35, 17, 7, 22, 86, 49, 10 };
        int n = arr.length;

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