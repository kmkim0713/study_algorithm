package Sort;

import java.io.IOException;

public class HeapSort {
    // 힙 정렬

    public static void main(String[] args) throws IOException {

        int[] arr = {35, 17, 7, 22, 86, 49, 10};
        int number = arr.length;

        // heapify
        heapify(arr, arr.length);
//        printArr("최대 힙 구조 배열 ", arr, -1, -1);

        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
//            printArr("최대값을 맨 뒤와 바꾼 후 배열 ", arr, -1, -1);
            heapify(arr,i);

        }

        printArr("정렬 후 ", arr, -1, -1);

    }



    // 최대 힙 구조 만들기
    public static void heapify(int[] a, int idx) {

        for (int i = 1; i < idx; i++) { // i = 1 첫번째 자식노드부터. i가 0이면 루트 노드이다.
            int child = i;
            while (child > 0) { // 자식노드가 루트노드로 변하기 전까지

                boolean printFlag = false;

                int parent = (child - 1) / 2; // 자식노드에서 1을 빼고 2로 나눈게 부모노드
                if (a[child] > a[parent]) {
                    swap(a, child, parent);
                    printFlag = true;
                }

                child = parent; // 바뀐 부모노드를 자식노드로 바꿔준다.
                if (printFlag) {
                    printArr("[SWAP] child: "+child+" "+"parent: "+parent, a, -1, -1);
                } else{
                    printArr("child: "+child+" "+"parent: "+parent+"\t\t", a, -1, -1);
                }

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