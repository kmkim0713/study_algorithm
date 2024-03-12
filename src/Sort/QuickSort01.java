package Sort;

import java.io.IOException;

public class QuickSort01 {
    // 퀵 정렬 (좌측 끝값을 피벗으로)
    // https://erinh.tistory.com/entry/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%ED%80%B5-%EC%A0%95%EB%A0%AC-Quick-sort-%EC%9E%90%EB%B0%94-Java
    // 분할 정복 알고리즘
    // 하나는 왼쪽에서 출발 하나는 오른쪽에서 출발
    // 왼쪽에서 출발한건 피벗보다 큰 숫자를 만났을 때 정지. 오른쪽에서 출발한건 피벗보다 작은 숫자를 만났을 때 정지
    // 둘다 정지한 경우에는 정지한 위치한 값끼리 교환
    // 움직이다가 엇갈릿 경우는 작은 값과 피벗의 값을 교환
    // 이후로는 옮겨진 피벗의 위치를 기준으로 2개로 나눠서 각각 정렬 수행. 이때 피벗은 각각의 맨 처음의 인덱스 값
    // 복잡도는 N*logN 이지만 최악의 경우는 N^2 이다 --> 이미 정렬되어있는 경우의 데이터

    public static void main(String[] args) throws IOException {

        int[] arr = {35, 17, 7, 22, 86, 49, 10};
        quickSort(arr);

        printArr("정렬 후 ", arr, -1, -1);

    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int key = start; // 피벗값

        int i = start + 1;
        int j = end;

        while (i <= j) {

            while (arr[i] <= arr[key]) {
                i++;
            }
            while (arr[j] >= arr[key] && j > start) {
                j--;
            }

            if (i > j) {
                int temp = arr[j];
                arr[j] = arr[key];
                arr[key] = temp;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        quickSort(arr, start, j-1);
        quickSort(arr, j+1, end);

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