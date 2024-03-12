package Sort;

import java.io.IOException;

public class HeapSort {
    // 힙 정렬

    public static void main(String[] args) throws IOException {

        int[] heap = {35, 17, 7, 22, 86, 49, 10};
        int number = heap.length;

        // 먼저 전체 트리 구조를 최대 힙 구조로 변경.
        // 최대 힙구조는 부모 노드의 값이 자식노드의 값보다 크거나 같은 트리이며 완전 이진트리를 말한다.
        for (int i = 1; i < number; i++){
            int c = i;
            do{
                int root = (c - 1) / 2 ; // 자기 자신의 부모를 의미한다.
                if (heap[root] < heap[c]) {
                    swap(heap, root, c);
                }
                c = root; // 자식이 부모로 이동해서 반복적으로 수행
            } while(c != 0);
        }

        // 크기를 줄여가며 반복적으로 힙을 구성
        // 가장 큰 루트의 값을 제일 마지막 노드의 값과 바꾼 다음 힙을 구성
        for (int i = number - 1; i >= 0; i--) {
            swap(heap, 0, i); // 가장 큰 값을 맨 뒤로
            int root = 0;
            int c = 1;

            do { // 힙구조 만들기
                c = 2 * root + 1; // c는 root의 자식이다

                // 자식 중에 더 큰 값을 찾기. c가 범위를 벗어나지 않도록 조건 추가
                if (heap[c] < heap[c + 1] && c < i - 1){
                    c++; // 오른쪽 자식이 더 크면 바라보는 인덱스를 하나 키운다
                }

                // 루트보다 자식이 더 크면 교환
                if(heap[root] < heap[c] && c < i){
                    swap(heap, root, c);
                }
                root = c;
            } while (c < i);

        }

        printArr("정렬 후 ", heap, -1, -1);

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