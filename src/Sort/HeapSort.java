package Sort;

import java.io.IOException;

public class HeapSort {
    // 힙 정렬

    public static void main(String[] args) throws IOException {

        int[] arr = {35, 17, 7, 22, 86, 49, 10};
        int number = arr.length;

        // heapify
        heapify(arr, arr.length);

        // heap sort
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i); // 루트 노드를 마지막 요소와 바꾼다.
            heapify(arr, i); // 바뀐 구조를 기준으로 최대힙구조를 만든다.
        }

        printArr("정렬 후 ", arr, -1, -1);

    }

    // 최대 힙 구조 만들기
    // 첫번째 자식(i=1)부터 시작
    // 자식으로 취급되는 i번째 노드의 인덱스를 child에 저장. child 인덱스의 부모 노드를 확인하고 부모노드보다 크면 swap
    // child 인덱스를 기준으로 부모 노드를 찾기위해 다시 반복문 수행. child 인덱스 값이 루트 인덱스가 되기 전까지 반복
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

                if (printFlag) {
                    printArr("[SWAP] i값: " + i + " child: " + child + " parent: " + parent + "\t", a, -1, -1);
                } else {
                    printArr("i값: " + i + " child: " + child + " parent: " + parent + "\t\t", a, -1, -1);
                }
                child = parent; // 바뀐 부모노드를 자식노드로 바꿔준다.
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