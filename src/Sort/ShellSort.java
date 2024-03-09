package Sort;

import java.io.IOException;

public class ShellSort {
    // 셸 정렬
    // 기존의 삽입 정렬의 장점을 가져오고 단점을 보완한 정렬
    // 삽입 정렬을 수행하기 전에 전체 데이터를 거의 정렬된 상태로 만들면 기존의 삽입 정렬을 그대로 처음부터 사용하는 것보다 더 좋은 성능을 발휘할 수 있다는 점에서 착안
    // 같은 값을 가지는 데이터의 기존 순서 유지를 보장할 수 없는 불안정 정렬
    // Gap을 두어 인접하지 않은 값들끼리 비교하는 정렬

    public static void main(String[] args) throws IOException {

        int[] arr = {35, 17, 74, 32, 10, 1, 14, 69, 99, 94, 33, 11, 24, 33, 28, 7, 5, 59, 38, 6, 40, 20, 41};
        int n = arr.length;

        int gap;

        for (gap = 1; gap < n / 2; gap = gap * 3 + 1) ; // gap < n/2 를 만족하면 gap = gap * 3 + 1 수행

        System.out.println("[배열길이]: " + n);
        System.out.println("[초기 gap]: " + gap);
        printArr("[정렬 전] ",arr,-1,-1);


        for (; gap >= 1; gap = gap / 3) { // gap을 줄이기

            // 삽입 정렬. 텀이 -1이 아닌 -gap
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i - gap;

                while (j >= 0 && arr[j] > temp) {
                    arr[j + gap] = arr[j];
                    j = j - gap;
                }
                arr[j + gap] = temp;
            }
        }
        printArr("[정렬 후] ",arr,-1,-1);
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