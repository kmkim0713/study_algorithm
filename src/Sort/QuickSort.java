package Sort;

import java.io.IOException;

public class QuickSort {
    // 퀵 정렬

    public static void main(String[] args) throws IOException {

        int[] arr = {35, 17, 7, 22, 86, 49, 10};
        quickSort(arr);

        printArr("정렬 후 ",arr,-1,-1);

    }

    public static void quickSort(int[] arr) {

        quickSort(arr, 0, arr.length - 1);

    }

    public static void quickSort(int[] arr, int start, int end) {

        if (start >= end) return;


        // 가장 왼쪽의 값을 pivot으로 지정. 비교검사는 pivot + 1 부터 시작.
        int pivot = start;
        int lo = start + 1;
        int hi = end;


        while (lo <= hi) {

            while (lo <= end && arr[lo] <= arr[pivot]) lo++; // 배열의 끝까지 검사. pivot과 같거나 더 작은지 검사하면서 인덱스 증가.

            while (hi > start && arr[hi] >= arr[pivot]) hi--; // pivot보다 작은 인덱스로 갈 순 없음. pivot보다 큰지 검사하면서 인덱스 감소.

            if (lo > hi) { // 엇갈렸을 때 피벗과 교체
                swap(arr, hi, pivot);
            } else { // 엇갈리지 않으면 lo, hi 값 교체
                swap(arr, lo, hi);
            }
        }

        quickSort(arr, start, hi - 1);
        quickSort(arr, hi + 1, end);

    }


    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
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