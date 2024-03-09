package Sort;

import java.io.IOException;

public class StraightSelectionSort {
    // 단순 선택 정렬
    // loop를 수행할 때 마다 배열에서 가장 작은 수를 찾고 배열의 제일 앞에서부터 차례대로 교환한다.
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