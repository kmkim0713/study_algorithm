import java.io.IOException;

public class SortBubble {


    public static void main(String[] args) throws IOException {

        // 개선된 버블 정렬

        int[] arr = {5, 4, 52, 10, 3, 45, 33};
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int exchangeCount = 0; // 교환횟수
            for (int j = n - 1; j > 0; j--) {
                printArr("[ 정렬 전 ]", arr, j - 1, j);
                exchangeCount = swap(arr, j - 1, j, exchangeCount);
                printArr("[ 정렬 후 ]", arr, j - 1, j);
            }
            System.out.println("<< 교환 횟수: " + exchangeCount + " >>");
            System.out.printf("[ %d번째 pass 종료 ] \n", i + 1);

            if (exchangeCount == 0) {
                break;
            }

        }
        System.out.println("[ 버블정렬 종료 ]");

    }

    public static int swap(int[] arr, int a, int b, int exchangeCount) {
        int temp = 0;
        if (arr[a] > arr[b]) {
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            System.out.println("\t\t[ swap 발생 ]");
            exchangeCount++;
        } else {
            System.out.println("\t\t[ skip ]");
        }
        return exchangeCount;

    }

    public static void printArr(String msg, int[] arr, int a, int b) {
        System.out.println("--- " + msg + " ---");
        System.out.print("\t\t");
        for (int i = 0; i < arr.length; i++) {
            if (i == a || i == b) {
                System.out.printf("[%d] ", arr[i]);
                continue;
            }
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
        if (msg.equals("[ 정렬 후 ]")) {
            System.out.println();
        }
    }

}