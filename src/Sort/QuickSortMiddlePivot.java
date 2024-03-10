package Sort;

import java.io.IOException;

public class QuickSortMiddlePivot {
    // 퀵 정렬 (좌측 끝값을 피벗으로)
    // https://erinh.tistory.com/entry/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%ED%80%B5-%EC%A0%95%EB%A0%AC-Quick-sort-%EC%9E%90%EB%B0%94-Java

    public static void main(String[] args) throws IOException {

        int[] arr = {35, 17, 7, 22, 86, 49, 10};
        quickSort(arr);

        printArr("정렬 후 ", arr, -1, -1);

    }

    public static void quickSort(int[] arr) {

        quickSort(arr, 0, arr.length - 1);

    }

    public static void quickSort(int[] arr, int start, int end) {

        if (start >= end) return;

        int left = start;
        int right = end;
        int pivot = partition(arr, left, right);

        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot, right);


    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];

        while(left <= right){

            while(arr[left] < pivot) left++;

            while(arr[right] > pivot) right--;

            if (left <= right){ // 엇갈리지 않으면 swap. while문 조건과 동일.
                swap(arr, left, right);
                left ++;
                right --;
            }
        }

        // 엇갈리게 되면 그룹을 나누는 과정을 종료되어야하고 두 그룹으로 나누어져야하므로
        // 두 그룹으로 나누기위한 기준값을 반환
        return left;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void printArr(String msg, int[] arr, int a, int b) {
        System.out.print(msg + "\t\t");
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