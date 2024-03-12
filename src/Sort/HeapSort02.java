package Sort;

import java.io.IOException;

public class HeapSort02 {
    // 힙 정렬

    public static void main(String[] args) throws IOException {

        int[] arr = {35, 17, 7, 22, 86, 49, 10};
        int number = arr.length;

        // heapify
        heapify(arr, arr.length);

        // heap sort
        for (int i = arr.length - 1 ; i > 0; i--){
            swap(arr, i ,0);
            heapify(arr, i);
        }
        printArr("정렬 후 ", arr, -1, -1);
    }

    public static void heapify(int[] arr, int idx) {

        for(int i = 1; i < idx; i++){
            int child = i;
            while(child > 0){
                int parent = (child - 1) / 2;
                if(arr[child] > arr[parent]){
                    swap(arr, child, parent);
                }
                child = parent;
            }
        }
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