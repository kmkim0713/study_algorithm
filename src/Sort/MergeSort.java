package Sort;

import java.io.IOException;


public class MergeSort {

    public static int[] sortedArr;

    // 병합 정렬
    // "일단 반으로 나누고 나중에 합쳐서 정렬해보면 어떨까?"
    public static void main(String[] args) throws IOException {

        int[] arr = {35, 17, 7, 22, 86, 49, 10};
        int n = arr.length;

        sortedArr = new int[n]; // 정렬시마다 배열생성하지 않고 스테틱 변수로 선언

        mergeSort(arr, 0, n - 1);

        printArr("[정렬 후] ", arr, -1, -1);

    }


    public static void mergeSort(int[] arr, int m, int n) { // 배열 분할
        if (m < n) {
            int middle = (m + n) / 2;
            mergeSort(arr, m, middle);
            mergeSort(arr, middle + 1, n);
            merge(arr, m, middle, n);
        }
    }


    // 합치기
    public static void merge(int[] arr, int m, int middle, int n) {
        int i = m;
        int j = middle + 1;
        int k = m; // sortedArr의 인덱스

        while (i <= middle && j <= n) { // 인덱스번호이므로 등호 필수
            if (arr[i] <= arr[j]) {
                sortedArr[k++] = arr[i++];
            } else {
                sortedArr[k++] = arr[j++];
            }
        }

        if (i > middle) { // 왼쪽이 먼저 끝난 경우
            for (int t = j; t <= n; t++) {
                sortedArr[k++] = arr[t];
            }
        } else { // 오른쪽이 먼저 끝난 경우
            for (int t = i; t <= middle; t++) {
                sortedArr[k++] = arr[t];
            }
        }

        for (int t = m; t <= n; t++) {
            arr[t] = sortedArr[t];
        }
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