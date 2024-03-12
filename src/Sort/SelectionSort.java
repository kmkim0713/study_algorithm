package Sort;

import java.io.IOException;

public class SelectionSort {
    // 선택 정렬
    // 가장 작은 값을 제일 앞으로 보내기
    // 시작은 앞에서부터, 검사는 뒤에서부터

    public static void main(String[] args) {

        int[] array = {15, 17, 52, 10, 3, 49, 33};

        int n = array.length;
        int start = 0;

        while(start < n){

            int min = array[start];
            int minIndex = start;

            for (int j = n - 1 ; j >= start ; j--){

                if(min > array[j]){
                    min = array[j];
                    minIndex = j;
                }
            }
            swap(array, start++, minIndex);
        }
        printarray("[최종 출력]", array, -1, -1);
    }

    public static void swap(int[] array, int a, int b) {

        int temp = 0;
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;

    }

    public static void printarray(String msg, int[] array, int a, int b) {
        System.out.printf(msg + "\t\t");
        for (int i = 0; i < array.length; i++) {
            if (i == a) {
                System.out.printf("[%d] ", array[i]);
                continue;
            }
            System.out.printf("%d ", array[i]);
        }
        System.out.println();

    }
}