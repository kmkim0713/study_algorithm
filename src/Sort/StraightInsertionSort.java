package Sort;

import java.io.IOException;

public class StraightInsertionSort {
    // 단순 삽입 정렬
    // 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여 자신의 위치를 찾아 삽입
    // 단순 삽입 정렬은 두 번째 요소부터 시작
    // 배열을 targetIndex를 기준으로 왼쪽은 정렬된 부분, 오른쪽은 정렬되지 않은 부분으로 나눈다.
    public static void main(String[] args) throws IOException {

        int[] arr = {35, 17, 7, 32, 10, 49, 33};
        int n = arr.length;

        int start = 1;

        while (start <= n - 1) {

            printArr("[pass 수행 전 ]", arr, -1, -1);
            printArr("[target index ]", arr, start, -1);

            for (int j = start; j > 0; j--) {
                if(arr[j - 1] > arr[j]){
                    swap(arr,j-1,j);
                }
                else{
                    printArr("[skip]\t\t", arr, j-1, j);
                }
            }
            start++;
            printArr("[pass 수행 후 ]", arr, -1, -1);
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