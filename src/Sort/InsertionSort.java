package Sort;

import java.io.IOException;

public class InsertionSort {
    // 단순 삽입 정렬
    // 소스코드를 더 간결하게
    public static void main(String[] args) throws IOException {

        int[] arr = {35, 17, 7, 22, 86, 49, 10 };
        int n = arr.length;
        System.out.println("[배열길이]: " + n);

        printArr("[정렬 전] ",arr,-1,-1);

        for(int i=1; i< n;i++){
            int temp = arr[i]; // 삽입할 데이터(기준). 삽입하기전까지 temp에 가지고 있는다.
            int j = i - 1; // i보다 왼쪽에 위치한 데이터를 검사. i - 1부터 시작.

            System.out.println(i + "회 수행");
            while(j >= 0 && arr[j] > temp){ // 삽입 정렬에서 기준값의 왼쪽은 모두 정렬되어있다
                // 왼쪽의 값이 더 크면 값을 복사해서 옮긴다
                arr[j+1] = arr[j];
                j--; // 왼쪽으로 이동
                printArr("[이동]\t ",arr,j,j+1);
            }

            arr[j+1] = temp; // j는 j--을 하고 while문을 종료하므로 j+1위치에 삽입
            printArr("[결과]\t ",arr,-1,-1);

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