package Sort;

import java.io.IOException;

public class MergeSort {
    // 병합 정렬
    // "일단 반으로 나누고 나중에 합쳐서 정렬해보면 어떨까?"
    public static void main(String[] args) throws IOException {

        int[] arr = {35, 17, 7, 22, 86, 49, 10};
        int n = arr.length;

        mergeSort(arr, 0, n);

        printArr("[정렬 후] ", arr, -1, -1);

    }


    public static void mergeSort(int[] arr, int left, int right) { // 배열 분할
        int middle = 0;
        if (left < right) {
            middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }

    }


    public static void merge(int[] arr, int left, int middle, int right) {

        int leftIndex = left; // 분할된 왼쪽 배열의 첫번째 인덱스
        int rightIndex = middle + 1; // 분할된 오른쪽 배열의 첫번째 인덱스

        int sortedIndex = left; // 정렬된 데이터가 저장될 인덱스. 분할된 왼쪽 배열의 첫번째 인덱스부터 시작. left와 동일

        int[] sortedArr = new int[(left + right) / 2];

        // 작은 순서대로 임시배열에 삽입
        while (leftIndex <= middle && rightIndex <= right){

            // 더 작은값을 임시배열에 넣는다
            if (arr[leftIndex] <= arr[rightIndex]){
                sortedArr[sortedIndex++] = arr[leftIndex++];
            } else {
                sortedArr[sortedIndex++] = arr[rightIndex++];
            }
        }

        // 만약에 왼쪽 배열에서 먼저 탈출한 경우에는 오른쪽 배열도 다 넣어줘야한다. 나머지는 비교할 필요가 없다. 어차피 정렬되어있을테니까.
        if(left > middle){
            for (int i = rightIndex ;i <= right; i++){
                sortedArr[sortedIndex++] = arr[i];
            }
        } else {
            for (int i = leftIndex ;i <= middle; i++){
                sortedArr[sortedIndex++] = arr[i];
            }
        }

        // 마지막으로 정렬된 배열을 삽입
        for (int i = left; i < arr.length; i++){
            arr[i] = sortedArr[i];
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