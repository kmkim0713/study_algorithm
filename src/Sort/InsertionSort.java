package Sort;

import java.io.IOException;

public class InsertionSort {
    // 삽입 정렬. 복잡도는 n^2
    // 각 숫자를 적절한 위치에 삽입하는 방법
    // 삽입 정렬은 무조건 스왑하는 것이 아닌 필요할 때만 위치를 바꾼다
    // 삽입 정렬은 앞에 있는 요소들이 정렬되어있다고 "가정"하고
    // 한칸씩 오른쪽으로 옮기면서 왼쪽의 적절한 위치에 넣는다
    // 그러므로 시작은 1부터 시작

    public static void main(String[] args) {

        int[] arr = {35, 17, 7, 22, 86, 49, 10};
        int n = arr.length;


        for (int i = 1; i < n ; i++){

            int j = i - 1;
            int temp = arr[i];

            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

        printArr("결과",arr,-1,-1);
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