package Sort;

import java.io.IOException;

public class BubbleSort {
    // 버블 정렬
    // 아주 직관적. 당장 옆의 값과 비교해서 더 작은 값을 앞으로 보낸다.
    // 한번의 pass가 끝나면 제일 큰 숫자가 맨 뒤로 감

    public static void main(String[] args) throws IOException {

        int[] arr = {5, 4, 52, 10, 3, 45, 33};
        int n = arr.length;

        for (int i = 0; i < n; i++){
            int temp;
            for(int j = 0; j < i - 1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArr("[ 종료 ]",arr,-1,-1);

    }

    public static void printArr(String msg, int[] array, int a, int b) {
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