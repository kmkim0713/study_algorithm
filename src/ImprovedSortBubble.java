import java.io.IOException;

public class ImprovedSortBubble {

    public static void main(String[] args) throws IOException {

        // SortBubble.java를 개선한 버블 정렬 코드
        // swap은 숫자를 교환하기만 하는 메소드로 변경
        // swap이 일어나지 않는 부분도 for문을 도는 것이 비효율적
        // 마지막 swap 시점을 저장해 두었다가, while문을 새로 loop 할 때마다 안쪽 for문의 시작값에 할당하여
        // for문을 효율적으로 돌 수 있게 변경

        int[] arr = {35, 4, 52,11,28,40, 10, 3, 45, 33};
        int n = arr.length;

        int start = 0;
        int lastSwapIndex = 0;

        while (start < n - 1) {

            for (int j = n - 1; j > start; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                    lastSwapIndex = j;
                } else {
                    printArr("[skip 후 ]", arr, j - 1, j);

                }
            }
            start = lastSwapIndex;
            System.out.printf("[pass 종료. 다음 start는 %d]\n\n", start);

        }

    }

    public static void swap(int[] arr, int a, int b) {

        int temp = 0;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        printArr("[swap 후 ]", arr, a, b);

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