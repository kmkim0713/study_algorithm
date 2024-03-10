package Sort;

import java.io.IOException;

public class QuickSortLeftPivot {
    // 퀵 정렬 (좌측 끝값을 피벗으로)
    // https://erinh.tistory.com/entry/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%ED%80%B5-%EC%A0%95%EB%A0%AC-Quick-sort-%EC%9E%90%EB%B0%94-Java

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
        int left = start + 1;
        int right = end;


        while (left <= right) {

            while (left <= end && arr[left] <= arr[pivot]) left++; // 배열의 끝까지 검사. pivot 같거나 더 작은지 검사하면서 인덱스 증가.

            while (right > start && arr[right] >= arr[pivot]) right--; // pivot 작은 인덱스로 갈 순 없음. pivot보다 큰지 검사하면서 인덱스 감소.

            if (left > right) {
                swap(arr, right, pivot); // 엇갈렸을 때는 오른쪽에서 시작한 hi와 피벗을 교체. hi가 있던 위치는 정렬위치가 확정
            } else {
                swap(arr, left, right); // 엇갈리지 않으면 서로 피벗보다 크거나 작아서 그런것이니 left, right 값 교체
            }
        }

        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);

    }


    public static void swap(int[] arr, int a, int b) {
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